package java_basic;

public class topic_13_string_format {

	// Những locator gần như là giống format, chỉ khác nhau value text() - kiểu dữ liệu String
	// Kiểu 1: các locators có 1 tham số giống nhau
	public static String DYNAMIC_SIDEBAR_LINK_FOR_PAGE_NAME = "xpath=//div[@class='block block-account-navigation']//a[text()='%s']";
	// Kiểu 2: các locators có nhiều tham số giống nhau
	public static String DYNAMIC_LINK_FOR_PAGE_NAME = "xpath=//div[@class='%s']//a[text()='%s']";

	public static void main(String[] args) {
		clicktoSideBarLink(DYNAMIC_SIDEBAR_LINK_FOR_PAGE_NAME, "Reward points");
		clicktoSideBarLink(DYNAMIC_SIDEBAR_LINK_FOR_PAGE_NAME, "Orders");
		clicktoSideBarLink(DYNAMIC_SIDEBAR_LINK_FOR_PAGE_NAME, "Addresses");

		clickToFooterLink(DYNAMIC_LINK_FOR_PAGE_NAME, "block block-account-navigation", "Orders");
	}

	// Hàm cho 1 tham số động
	public static void clicktoSideBarLink(String dynamicLocator, String pageName) {
		String locator = String.format(dynamicLocator, pageName);
		System.out.println("Click to: " + locator);
	}

	// Hàm cho nhiều tham số động
	public static void clickToFooterLink(String dynamicLocator, String... params) { // Với cách dùng dấu ... sau String, ta có thể truyền vào nhiều đối số cùng kiểu dữ liệu String, không giới hạn số lượng
		String locator = String.format(dynamicLocator, (Object[]) params);
		System.out.println("Click to: " + locator);
	}

}
