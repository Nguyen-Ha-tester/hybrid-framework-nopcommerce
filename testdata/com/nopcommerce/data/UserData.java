package com.nopcommerce.data;

import utilities.DataHelper;

public class UserData {

	public static DataHelper dataHelper = DataHelper.getDataHelper();

	public static class Register {
		public static final String FIRSTNAME = dataHelper.getFirstName();
		public static final String LASTNAME = dataHelper.getLastName();
		public static final String EMAIL = dataHelper.getEmailAddress();
		public static final String PASSWORD = dataHelper.getPassword();
	}
}
