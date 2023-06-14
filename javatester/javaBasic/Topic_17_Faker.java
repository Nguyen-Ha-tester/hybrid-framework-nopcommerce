package javaBasic;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

public class Topic_17_Faker {

	public static void main(String[] args) {
		// Mặc định data là US
		Faker faker = new Faker();
		System.out.println(faker.name().fullName());
		System.out.println(faker.date().future(1, TimeUnit.HOURS));
		System.out.println(faker.date().birthday());

		// Việt nam data
		Faker fakerVI = new Faker(new Locale("vi"));
		System.out.println(fakerVI.name().fullName());
		System.out.println(fakerVI.date().future(1, TimeUnit.HOURS));
		System.out.println(fakerVI.date().birthday());
		System.out.println(fakerVI.animal().name());
		System.out.println(fakerVI.address().cityName());
		System.out.println(fakerVI.finance().creditCard(CreditCardType.AMERICAN_EXPRESS));

	}

}
