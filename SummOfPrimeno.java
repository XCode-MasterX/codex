package projecteuler;
public class SummOfPrimeno {
	public static void main(String[] args) {
		int n = 2000000;
		long sum = 0;
		for(int i = 2 ; i <= n ;i++) {
			if(isP(i))
				sum += i;
			}
		System.out.println(sum);		
	}	static boolean isP(long n ) {
		boolean ans = true;
		for(long i = 2l ;i*i <= n ;i++) {
			if(n % i == 0)
				ans = false;
			}
		return ans;
		}
	}