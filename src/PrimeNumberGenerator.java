import java.util.ArrayList;

public class PrimeNumberGenerator {

	public PrimeNumberGenerator() {
	}

	public static ArrayList<Integer> primes(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] primes = {2,3,5};
		for(int i=0;i<primes.length;i++){
			if(primes[i]<num){
				list.add(primes[i]);
			}
		}
		return list;
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
