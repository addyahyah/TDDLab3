import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeFactorizationTest {
	PrimeFactorization test = new PrimeFactorization();
	ArrayList<Integer> list = new ArrayList<Integer>();

	@Test
	public void test1() {
		assertEquals(list, test.primeFactorization(1));
	}

	@Test
	public void test2() {
		list.add(2);
		assertEquals(list, test.primeFactorization(2));
	}

	@Test
	public void test3() {
		list.add(3);
		assertEquals(list, test.primeFactorization(3));
	}
	
	@Test
	public void test4() {
		list.add(2);
		list.add(2);
		assertEquals(list, test.primeFactorization(4));
	}
	
	@Test
	public void test6() {
		list.add(2);
		list.add(3);
		assertEquals(list, test.primeFactorization(6));
	}
}

