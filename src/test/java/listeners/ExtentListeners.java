package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentListeners implements ITestListener {
	
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void configureReport() {
		htmlReporter = new ExtentSparkReporter("ExtentReport.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("Browser", "Chrome");
		
		htmlReporter.config().setDocumentTitle("Web Shop Report");
	}
	
	public void onStart(ITestContext context) {
		configureReport();
	}
	
	public void onTestSuccess(ITestResult result) {
		test = reports.createTest(result.getName());
		test.pass("Name of passed test case is " + result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		test = reports.createTest(result.getName());
		test.fail("Name of failed test case is " + result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		test = reports.createTest(result.getName());
		test.skip("Name of skipped test case is " + result.getName());
	}
	
	public void onFinish(ITestContext context) {
		reports.flush();
	}
	
}
