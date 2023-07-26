package org.RunnerClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(

		features = {
				"C:\\Users\\gbalasubramania01\\eclipse-workspace\\Autobots_Pilot_projects\\src\\test\\resources\\FeatureFilesFolder\\2.1AccountSummaryFolder\\2.1.1ViewAccountSummary.feature",
				"C:\\Users\\gbalasubramania01\\eclipse-workspace\\Autobots_Pilot_projects\\src\\test\\resources\\FeatureFilesFolder\\2.1AccountSummaryFolder\\2.1.2ViewCurrentBalance.feature",
				"C:\\Users\\gbalasubramania01\\eclipse-workspace\\Autobots_Pilot_projects\\src\\test\\resources\\FeatureFilesFolder\\2.1AccountSummaryFolder\\2.1.3ViewPaymentHistory.feature",
				"C:\\Users\\gbalasubramania01\\eclipse-workspace\\Autobots_Pilot_projects\\src\\test\\resources\\FeatureFilesFolder\\2.1AccountSummaryFolder\\2.1.4PrintandExportPayment.feature",
				"C:\\Users\\gbalasubramania01\\eclipse-workspace\\Autobots_Pilot_projects\\src\\test\\resources\\FeatureFilesFolder\\2.1AccountSummaryFolder\\2.1.5SearchPayment.feature",
				"C:\\Users\\gbalasubramania01\\eclipse-workspace\\Autobots_Pilot_projects\\src\\test\\resources\\FeatureFilesFolder\\2.1AccountSummaryFolder\\2.1.6ViewPayment.feature",
				"C:\\Users\\gbalasubramania01\\eclipse-workspace\\Autobots_Pilot_projects\\src\\test\\resources\\FeatureFilesFolder\\2.1AccountSummaryFolder\\2.1.7PrintPayment.feature"
		}, 
		
				glue = {"org.SecondModuleStepDefinition" }, 
						plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				monochrome = true,
				dryRun = true
				)
public class AccountSummaryRunnerClass extends AbstractTestNGCucumberTests {

}
