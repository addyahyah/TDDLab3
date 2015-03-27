import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
public class PrimeFactorizationTest {
	PrimeFactorization test = new PrimeFactorization();
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	@Test
	public void test1() {
		assertEquals(list,test.primeFactorization(1));
	}
	
	@Test
	public void test2() {
		list.add(2);
		assertEquals(list,test.primeFactorization(2));
	}
}
