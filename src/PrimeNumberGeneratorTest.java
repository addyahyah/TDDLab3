import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeNumberGeneratorTest {
	private Integer inputNumber;
	private ArrayList<Integer> expectedResult;
	private PrimeNumberGenerator primeNumberGenerator;

	@Before
	public void initialize() {
		primeNumberGenerator = new PrimeNumberGenerator();
	}

	// Each parameter should be placed as an argument here
	// Every time runner triggers, it will pass the arguments
	// from parameters we defined in primeNumbers() method
	public PrimeNumberGeneratorTest(Integer inputNumber,
			ArrayList<Integer> expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(2);
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(2);
		list4.add(3);
		ArrayList<Integer> list6 = new ArrayList<Integer>();
		list6.add(2);
		list6.add(3);
		list6.add(5);
		ArrayList<Integer> list8 = new ArrayList<Integer>();
		list8.add(2);
		list8.add(3);
		list8.add(5);
		list8.add(7);
		return Arrays.asList(new Object[][] { 
				{ 1, new ArrayList<Integer>() }, 
				{ 2, new ArrayList<Integer>() },
				{ 3, list3 }, 
				{ 4, list4},
				{6, list6},
				{8, list8}});
	}

	// This test will run 5 times since we have 5 parameters defined
	@Test
	public void testPrimeNumberGenerator() {
		assertEquals(expectedResult, primeNumberGenerator.primes(inputNumber));
	}
}