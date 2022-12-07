package projecteuler;
public class SumSquareDifference {
	public static void main(String[] args) {		
		int n = 10;
		long sum = 0,sq = 0;
		for(int i = 1 ;i <= n ;i++) {
			sum += i*i;
			}
		sq = ((n*(n+1))/2)*((n*(n+1))/2);
		System.out.println((sq-sum));
		}
}