import java.util.ArrayList;

public class PrimeNumberGenerator {

	public PrimeNumberGenerator(){
	}
	
	public static ArrayList<Integer> primes(int num){
		return null;
	}
	
	public Boolean validate(final Integer primeNumber) {
		for (int i = 2; i < (primeNumber / 2); i++) {
			if (primeNumber % i == 0) {
				return false;
			}
		}
		return true;
	}

}
