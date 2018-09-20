
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class RentalTest {
	@Test
	public void rentThreeFilmsForFourDays() {
		Rental rental = new Rental();
		assertThat(rental.rent(3, 4)).isEqualTo(16.5);
	}

	@Test
	public void rentFourFilmsForThreeDays() {
		Rental rental = new Rental();
		assertThat(rental.rent(4, 2)).isEqualTo(8);
	}
}
