package org.SecondModuleStepDefinition;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountSummaryStepDefinition {

	WebDriver driver;
	File f = new File(
			"C:\\Users\\gbalasubramania01\\eclipse-workspace\\Autobots_Pilot_projects\\src\\main\\resources\\ExcelFile\\Book 9 (4).xlsx");

	
	@Given("Launch the Cyclos application")
	public void launch_the_cyclos_application() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.cyclos.org/ui/home");
		PageFactory.initElements(driver, AccountSummaryRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.login));
		AccountSummaryRepo.login.click();
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("usersheet");
		Row row = mysheet.getRow(1);
		Cell a = row.getCell(0);
		Cell b = row.getCell(1);
		String username = a.getStringCellValue();
		int password = (int) b.getNumericCellValue();
		String pass = Integer.toString(password);
		AccountSummaryRepo.Uname.sendKeys(username);
		AccountSummaryRepo.Password.sendKeys(pass);
		AccountSummaryRepo.submit.click();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Login Clicked");
	}

	
	@When("Click  on Banking")
	public void click_on_banking() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.Banking));
		AccountSummaryRepo.Banking.click();
		
	}

	
	@When("check whether it is in member account")
	public void check_whether_it_is_in_member_account() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.check));
		String Expected = "Member account";
		String Actual = AccountSummaryRepo.check.getText();
		System.out.println(Actual);
		Assert.assertEquals(Actual, Expected);
	}

	@Then("display the account summary")
	public void display_the_account_summary() {
		boolean res = AccountSummaryRepo.AccountSummary.isDisplayed();
		System.out.println("Result is Displayed:" + res);
	}

	
	@Then("display the Current Balance")
	public void display_the_current_balance() {
		String Bal = AccountSummaryRepo.CurrentBal.getText();
		System.out.println(Bal);
	}

	
	@When("Click  on Notification icon")
	public void click_on_notification_icon() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.Notification));
		AccountSummaryRepo.Notification.click();
	}

	
	@Then("display the payment history")
	public void display_the_payment_history() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.PaymentHis));
		boolean res2 = AccountSummaryRepo.PaymentHis.isDisplayed();
		System.out.println(res2);
	}


	@When("click on payment to user")
	public void click_on_payment_to_user() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.UserPay));
		AccountSummaryRepo.UserPay.click();
	}

	
	@When("click pick from your contact list and select a contact")
	public void click_pick_from_your_contact_list_and_select_a_contact() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.PickFromCont));
		AccountSummaryRepo.PickFromCont.click();
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("usersheet");
		Row row = mysheet.getRow(1);
		Cell c = row.getCell(2);
		String Cont = c.getStringCellValue();
		AccountSummaryRepo.PickFromCont.sendKeys(Cont);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.contactList));
		AccountSummaryRepo.contactList.click();
	}


	@When("enter the amount and click Scheduling")
	public void enter_the_amount_and_click_scheduling() throws Exception {

		AccountSummaryRepo.amt.sendKeys("1");
		WebDriverWait waits = new WebDriverWait(driver, 15);
		waits.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.She));
		AccountSummaryRepo.She.click();
	}


	@When("select the schedules and enter the number of installments")
	public void select_the_schedules_and_enter_the_number_of_installments() throws Exception {
		AccountSummaryRepo.Shed.click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.install));
		AccountSummaryRepo.install.sendKeys("8");

	}


	@When("click Description")
	public void click_description() {
		AccountSummaryRepo.descript.sendKeys("House rent");
	}


	@When("click next icon")
	public void click_next_icon() {
		AccountSummaryRepo.nxt.click();
	}

	
	@When("click confirm")
	public void click_confirm() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.confirm));
		AccountSummaryRepo.confirm.click();
		
	}

	@Then("Print the reciept")
	public void print_the_reciept() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.msg));
		boolean res4 = AccountSummaryRepo.msg.isDisplayed();
		if (res4) {
			System.out.println(AccountSummaryRepo.msg.getText());
			
		}else {
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.PrintPayment));
		AccountSummaryRepo.PrintPayment.click();
		}
		
		
		
	}

	@Then("Print the reciept displayed")
	public void print_the_reciept_displayed() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.PrintPayment));
		AccountSummaryRepo.PrintPayment.click();
	}

	@When("Click the Show  Filter button")
	public void click_the_show_filter_button() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.show));
		AccountSummaryRepo.show.click();
	}


	@When("Click the period menu and select any one option")
	public void click_the_period_menu_and_select_any_one_option() {
		AccountSummaryRepo.period.click();
		AccountSummaryRepo.list.click();
	}


	@When("Select the From Amount menu enter the amount value")
	public void select_the_from_amount_menu_enter_the_amount_value() throws Exception {
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("usersheet");
		Row row = mysheet.getRow(1);
		Cell f = row.getCell(3);
		int am = (int) f.getNumericCellValue();
		String amt = Integer.toString(am);
		AccountSummaryRepo.fromamt.sendKeys(amt);
	}


	@When("Select the Description menu and enter the values")
	public void select_the_description_menu_and_enter_the_values() throws Exception {
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("usersheet");
		Row row = mysheet.getRow(1);
		Cell g = row.getCell(5);
		String des = g.getStringCellValue();
		AccountSummaryRepo.desc.sendKeys(des);
	}


	@When("Click the Filter menu and select one option")
	public void click_the_filter_menu_and_select_one_option() {
		AccountSummaryRepo.Filter.click();
		AccountSummaryRepo.memb.click();

	}

	
	@When("Click the To Amount option and enter the value")
	public void click_the_to_amount_option_and_enter_the_value() throws Exception {
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("usersheet");
		Row row = mysheet.getRow(1);
		Cell g = row.getCell(3);
		int am = (int) g.getNumericCellValue();
		String amt = Integer.toString(am);
		AccountSummaryRepo.Toamt.sendKeys(amt);
	}


	@When("Click the Direction menu and select one option")
	public void click_the_direction_menu_and_select_one_option() {
		AccountSummaryRepo.Direc.click();
		AccountSummaryRepo.Deb.click();
	}

	
	@When("Click the Order by option and select one option")
	public void click_the_order_by_option_and_select_one_option() {
		AccountSummaryRepo.Order.click();
		AccountSummaryRepo.Nolh.click();
	}


	@Then("Download the statement")
	public void download_the_statement() {
		AccountSummaryRepo.Down.click();
		AccountSummaryRepo.Pdf.click();
	}


	@When("click any user from account summary")
	public void click_any_user_from_account_summary() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(AccountSummaryRepo.Payment));
		AccountSummaryRepo.Payment.click();
	}


	@Then("Display the payment details")
	public void display_the_payment_details() {
		boolean res3 = AccountSummaryRepo.PayDisp.isDisplayed();
		System.out.println(res3);
	}

}
