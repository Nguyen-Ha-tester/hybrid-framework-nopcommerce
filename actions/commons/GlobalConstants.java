package commons;

import java.io.File;

public class GlobalConstants {
	public static final String ADMIN_PAGE_URL = "https://admin-demo.nopcommerce.com";
	public static final String USER_PAGE_NOP_COMMERCE_URL = "https://demo.nopcommerce.com/";
	public static final String USER_PAGE_JQUERY_URL = "https://www.jqueryscript.net/demo/CRUD-Data-Grid-Plugin-jQuery-Quickgrid/";
	public static final String USER_PAGE_JQUERY_UPLOAD_FILE_URL = "https://blueimp.github.io/jQuery-File-Upload/";
	public static final String FACEBOOK_URL = "https://www.facebook.com/";
	public static final long LONG_TIMEOUT = 30;
	public static final long SHORT_TIMEOUT = 5;
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String OS_NAME = System.getProperty("os.name");

	// Trỏ về location mặc định của folder uploadFiles
	public static final String UPLOAD_FILE = PROJECT_PATH + File.separator + "uploadFiles" + File.separator;
	// Trỏ về location mặc định của folder downloadFiles
	public static final String DOWNLOAD_FILE = PROJECT_PATH + File.separator + "downloadFiles";
	public static final String BROWSER_LOG = PROJECT_PATH + File.separator + "browserLogs";
	public static final String DRAG_DROP_HTMLS = PROJECT_PATH + File.separator + "dragDropHTMLS";
	public static final String REPORTNG_SCREENSHOT = PROJECT_PATH + File.separator + "reportNGImages" + File.separator;
	// Một số thông tin của Database
	// Database Account/ User/ Port/ Pass của dev
	public static final String DB_DEV_URL = "19.12.32.331:339";
	public static final String DB_DEV_USER = "automationfc";
	public static final String DB_DEV_PASS = "P@sS13";
	// Database Account/ User/ Port/ Pass của test
	public static final String DB_TEST_URL = "123.01.42.031:139";
	public static final String DB_TEST_USER = "testauotmationfc";
	public static final String DB_TEST_PASS = "TeSTP@sS13";

	public static final long RETRY_TEST_FAIL = 3;
	public static final String USER_PAGE_JQUERY_UR_2 = "https://www.jqueryscript.net/demo/jQuery-Dynamic-Data-Grid-Plugin-appendGrid/";
}
