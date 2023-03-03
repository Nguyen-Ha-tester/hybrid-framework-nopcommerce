package java_basic;

public class topic_13_string_format {

	// Những locator gần như là giống phần đâu, chỉ khác nhau value text() - kiểu dữ liệu String
	public static String DYNAMIC_LINK_FOR_PAGE_NAME = "xpath=//div[@class='block block-account-navigation']//a[text()='%s']";

	public static void clicktoSideBarLink(String dynamicLocator, String pageName) {
		String locator = String.format(dynamicLocator, pageName);
		System.out.println("Click to: " + locator);
	}

	// dynamic locator là locator chứa %s, %t, %d...
	// phần Object... hoặc String... sẽ là phần text hoặc kiểu dữ liệu thay đổi
	// 1 biến DYNAMIC_LINK_FOR_PAGE_NAME dùng cho n pages có format locator giống nhau, chỉ khác nhau cái tên
	public static void main(String[] args) {
		clicktoSideBarLink(DYNAMIC_LINK_FOR_PAGE_NAME, "Reward points");
		clicktoSideBarLink(DYNAMIC_LINK_FOR_PAGE_NAME, "Orders");
		clicktoSideBarLink(DYNAMIC_LINK_FOR_PAGE_NAME, "Addresses");
	}

}
