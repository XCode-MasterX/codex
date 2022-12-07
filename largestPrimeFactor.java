package projecteuler;
public class largestPrimeFactor {
	public static void main(String[] args) {					
		long n = 600851475143l;
	long ans = 0l;		
	for(long i = (long)Math.sqrt(n) ;i >= 0 ;i--) {
		if(isP(i) && n % i == 0) {
			ans = i;				break;
			}
		}
	System.out.println(ans);
	}
	static boolean isP(long n ) {
		boolean ans = true;
		for(long i = 2l ;i*i < n ;i++) {
			if(n % i == 0)				ans = false;
			}
		return ans;	}		
}