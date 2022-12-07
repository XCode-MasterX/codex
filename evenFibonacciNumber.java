package projecteuler;
import java.util.*;
public class evenFibonacciNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 1,n2 = 2,sum=2;
		for(int i = 0 ; i < n-2 ;i++) {
			int t = n1;
			n1 = n2;
			n2 = n2+t;
			if((n2&1) == 0)
				sum += n2;
			}
		System.out.println(sum);
		}
}