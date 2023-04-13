package reportConfig;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import commons.BaseTest;
import commons.GlobalConstants;

public class ReportNGListener implements ITestListener {
	// ITestContext: đại diện cho testcase
	// ITestResult: đại diện cho test result
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) { // cần hàm này thui, để biết khi nào fail thì sẽ chụp hình fail lại. Chứ khi success thì thôi k cần show ảnh
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Object testClass = result.getInstance();
		WebDriver webDriver = ((BaseTest) testClass).getDriverInstance(); // Khi chạy testcase thì sẽ khởi tạo driver của BaseTest đầu tiên, nên sẽ lấy driver từ
		String screenshotPath = captureScreenshot(webDriver, result.getName());
		Reporter.getCurrentTestResult();
		// Extract ra file
		Reporter.log("<br><a href=\"file:///" + screenshotPath + "\">" + "<img src=\"file:///" + screenshotPath + "\" " + "height='100' width='150'/> " + "</a></br>");
		Reporter.setCurrentTestResult(null);
	}

	public String captureScreenshot(WebDriver driver, String screenshotName) {
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss"); // Thời gian chính là tên hình
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // Hàm chụp hình của Selenium, lưu thành FILE sau khi chụp
			String screenPath = GlobalConstants.REPORTNG_SCREENSHOT_FOLDER_PATH + screenshotName + "_" + formater.format(calendar.getTime()) + ".png";
			FileUtils.copyFile(source, new File(screenPath));
			return screenPath;
		} catch (IOException e) {
			System.out.println("Exception while taking screenshot: " + e.getMessage());
			return e.getMessage();
		}
	}
	// // Report with base 64: không chụp hình dạng file, k cần folder lưu file
	// @Override
	// public void onTestFailure(ITestResult result) {
	// try {
	// System.setProperty("org.uncommons.reportng.escape-output", "false");
	// Object testClass = result.getInstance();
	// WebDriver driver = ((BaseTest) testClass).getDriverInstance();
	// String screenshotPath = captureScreenshot(driver, result.getName());
	// Reporter.getCurrentTestResult();
	// // Extract ra dạng image link từ Base64
	// Reporter.log("<br><a href=\"data:image/png;base64," + screenshotPath + "\">" + "<img src=\"data:image/png;base64," + screenshotPath + "\" " + "height='100'
	// width='150'/> " + "</a></br>");
	// Reporter.setCurrentTestResult(null);
	// } catch (NoSuchSessionException e) {
	// e.printStackTrace();
	// } catch (WebDriverException e) {
	// e.printStackTrace();
	// }
	// }
	//
	// public String captureScreenshot(WebDriver driver, String screenshotName) {
	// String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	// return screenshotBase64;
	// }

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
