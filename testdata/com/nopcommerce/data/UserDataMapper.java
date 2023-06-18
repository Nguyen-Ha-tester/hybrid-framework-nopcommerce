package com.nopcommerce.data;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import commons.GlobalConstants;

public class UserDataMapper {
	// Hàm đọc file json
	public static UserDataMapper getUserData() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			return mapper.readValue(new File(GlobalConstants.PROJECT_PATH + "/resources/UserData.json"), UserDataMapper.class);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// Tạo biến lấy dữ liệu từ file json để map vào biến của class UserDataMapper, thư viện jackson giúp điều này bằng cách dùng annotaion @JsonProperty
	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("email")
	private String email;

	@JsonProperty("password")
	private String password;

	public String getFirstname() {
		return firstName;
	}

	// Jackson giúp mình set giữ liệu
	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// _______________________________________________________________//
	// Trường hợp có nhiều biến nhỏ trong 1 class
	@JsonProperty("login")
	private Login login;

	static class Login {
		@JsonProperty("emailLogin")
		private String emailLogin;
		@JsonProperty("passwordLogin")
		private String passwordLogin;

	}

	public void setEmailLogin(String emailLogin) {
		this.login.emailLogin = emailLogin;
	}

	public String getEmailLogin() {
		return login.emailLogin;
	}

	public void setPasswordLogin(String passwordLogin) {
		this.login.passwordLogin = passwordLogin;
	}

	public String getPasswordLogin() {
		return password;
	}

	// _______________________________________________________________//
	// Trường hợp biến mảng trong 1 class, trong mảng có key bị trùng, cần dùng List để lấy index
	@JsonProperty("subjects")
	private List<subjects> subjects;

	public List<subjects> getSubjects() {
		return subjects;
	}

	public static class subjects {
		@JsonProperty("name")
		private String name;

		@JsonProperty("point")
		private float point;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setPoint(float point) {
			this.point = point;
		}

		public float getPoint() {
			return point;
		}

	}

}