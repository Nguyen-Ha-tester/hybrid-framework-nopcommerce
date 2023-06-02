package com.nopcommerce.data;

import utilities.DataHelper_Fakerlibrary;

public class UserData {

	public static DataHelper_Fakerlibrary dataHelper = DataHelper_Fakerlibrary.getDataHelper();

	public static class Register {
		public static final String FIRSTNAME = dataHelper.getFirstName();
		public static final String LASTNAME = dataHelper.getLastName();
		public static final String EMAIL = dataHelper.getEmailAddress();
		public static final String PASSWORD = dataHelper.getPassword();
	}
}
