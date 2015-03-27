import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeFactorizationTest {
	PrimeFactorization test = new PrimeFactorization();
	ArrayList<Integer> list = new ArrayList<Integer>();

	@Test
	public void test1() {
		assertEquals(list, PrimeFactorization.primeFactorization(1));
	}

	@Test
	public void test2() {
		list.add(2);
		assertEquals(list, PrimeFactorization.primeFactorization(2));
	}

	@Test
	public void test3() {
		list.add(3);
		assertEquals(list, PrimeFactorization.primeFactorization(3));
	}
	
	@Test
	public void test4() {
		list.add(2);
		list.add(2);
		assertEquals(list, PrimeFactorization.primeFactorization(4));
	}
	
	@Test
	public void test6() {
		list.add(2);
		list.add(3);
		assertEquals(list, PrimeFactorization.primeFactorization(6));
	}
	
	@Test
	public void test8() {
		list.add(2);
		list.add(2);
		list.add(2);
		assertEquals(list, PrimeFactorization.primeFactorization(8));
	}
	
	@Test
	public void test9() {
		list.add(3);
		list.add(3);
		assertEquals(list, PrimeFactorization.primeFactorization(9));
	}
	
	@Test
	public void test325115() {
		list.add(5);
		list.add(7);
		list.add(7);
		list.add(1327);
		assertEquals(list, PrimeFactorization.primeFactorization(325115));
	}
}

