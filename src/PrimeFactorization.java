import java.util.ArrayList;

public class PrimeFactorization {

	public PrimeFactorization() {

	}

	public static ArrayList<Integer> primeFactorization(int num) {
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		while (num % 2 == 0) {
			if(num==0){
				break;
			}
			list2.add(2);
			num=num/2;
		}
		if(num!=1){
			list2.add(num);
		}
		return list2;

	}
}
