package utilities;

import java.util.Locale;

import com.github.javafaker.Faker;

public class RandomDataGeneration {

	static Faker faker;
	static int deduction;

	public static int getDeductionAmount() {
		faker = new Faker(new Locale("en-IND"));
		deduction = faker.number().numberBetween(500, 2000);
		return deduction;
	}
}