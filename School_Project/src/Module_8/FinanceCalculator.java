package Module_8;

public class FinanceCalculator {
	private static int MONTHS_IN_YEAR = 12;

	static double calculateFutureValue(double monthlyPayment, double rate, int years) {
		double futureValue = 0.0;
		int months = years * MONTHS_IN_YEAR;
		double presentValue = monthlyPayment * months;
		double interestRate = (1 + rate / 100);

		futureValue = (presentValue * (Math.pow(interestRate, months)));

		return futureValue;

	}

}
