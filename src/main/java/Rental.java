public class Rental {

	private final double extraPrice = 1.75;
	private final int daysOfBasicPrice = 2;
	private final int basicPrice = 2;

	public double rent(int amountFilms, int amountDays) {

		return calculateRent(amountFilms, amountDays);
	}

	private double calculateRent(int amountFilms, int amountDays) {
		double totalRent = 0.0;
		totalRent = amountFilms * basicPrice;
		if (amountDays > daysOfBasicPrice) {
			totalRent += amountFilms * ((amountDays - daysOfBasicPrice) * extraPrice);
		}
		return totalRent;
	}
}
