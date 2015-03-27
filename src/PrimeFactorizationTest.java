import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
public class PrimeFactorizationTest {
	PrimeFactorization test = new PrimeFactorization();
	ArrayList<Integer> list = new ArrayList<Integer>();
	@Test
	public void test1() {
		assertEquals(test.primeFactorization(1),list);
	}
	
	@Test
	public void test2() {
		assertEquals(test.primeFactorization(2),list.add(2));
	}
}
