package org.SecondModuleStepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryRepo {
	@FindBy(id = "login-link")
	public static WebElement login;
	@FindBy(xpath = "//input[@placeholder='User']")
	public static WebElement Uname;
	@FindBy(xpath = "//input[@placeholder='Password']")
	public static WebElement Password;
	@FindBy(css = "button.btn.d-flex")
	public static WebElement submit;
	@FindBy(xpath = "//div[text()='Banking']")
	public static WebElement Banking;
	@FindBy(css = "div.title-text.flex-grow-1")
	public static WebElement check;
	@FindBy(xpath = "//*[@class='table table-hover cursor-pointer']")
	public static WebElement AccountSummary;
	@FindBy(xpath = "//*[@class='status-value col-6 col-sm-3 positive']")
	public static WebElement CurrentBal;
	@FindBy(css = "#notifications-link")
	public static WebElement Notification;
	@FindBy(css = "table.table.table-hover")
	public static WebElement PaymentHis;
	@FindBy(xpath = "//div[@class='side-area']/following-sibling::div[1]")
	public static WebElement PayDisp;
	@FindBy(linkText = "Payment to user")
	public static WebElement UserPay;
	@FindBy(xpath = "//input[@placeholder='Type to search']")
	public static WebElement PickFromCont;
	@FindBy(linkText = "Active Walking")
	public static WebElement contactList;
	@FindBy(xpath = "//input[@placeholder='0,00']")
	public static WebElement amt;
	@FindBy(xpath = "//button[contains(@class,'form-control text-left')]//div[1]")
	public static WebElement She;
	@FindBy(linkText = "Monthly installments")
	public static WebElement Shed;
	@FindBy(xpath = "//input[@type='number']")
	public static WebElement install;
	@FindBy(css = "textarea.form-control.ng-pristine")
	public static WebElement descript;
	@FindBy(css = "button.btn.d-flex")
	public static WebElement nxt;
	@FindBy(xpath = "//span[text()='Confirm']")
	public static WebElement confirm;
	@FindBy(xpath = "//*[text()='Print']")
	public static WebElement PrintPayment;
	@FindBy(xpath = "//*[text()='Show filters']")
	public static WebElement show;
	@FindBy(xpath = "//button[@title='Last 12 months']")
	public static WebElement period;
	@FindBy(xpath = "//*[text()=' Last 12 months ']")
	public static WebElement list;
	@FindBy(xpath = "(//span[text()='From amount']/following::input)[1]")
	public static WebElement fromamt;
	@FindBy(xpath = "(//div[@class='d-flex label-value-value']//input)[3]")
	public static WebElement desc;
	@FindBy(xpath = "//div[text()='No options selected']")
	public static WebElement Filter;
	@FindBy(xpath = "//label[text()=' Member payments ']")
	public static WebElement memb;
	@FindBy(xpath = "(//span[text()='From amount']/following::input)[2]")
	public static WebElement Toamt;
	@FindBy(xpath = "//button[@title='Not applied']")
	public static WebElement Direc;
	@FindBy(xpath = "//a[contains(text(),'Outgoing')]")
	public static WebElement Deb;
	@FindBy(css = "button[title='Date (newest first)']")
	public static WebElement Order;
	@FindBy(xpath = "//a[contains(text(),'Amount (lowest first)')]")
	public static WebElement Nolh;
	@FindBy(xpath = "(//div[@class='w-100']//button)[1]")
	public static WebElement Down;
	@FindBy(xpath = "(//div[@class='dropdown-menu show']//button)[3]")
	public static WebElement Pdf;
	@FindBy(xpath = "(//table[contains(@class,'table table-hover')]//td)[3]")
	public static WebElement Payment;
	@FindBy(xpath="//*[text()='You have exceeded the maximum of payments per day for the demo network']")
	public static WebElement msg;
	
}
