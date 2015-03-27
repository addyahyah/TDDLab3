import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
public class PrimeFactorizationTest {
	PrimeFactorization test = new PrimeFactorization();

	@Test
	public void test1() {
		assertEquals(test.primeFactorization(1),new ArrayList<Integer>());
	}
}
