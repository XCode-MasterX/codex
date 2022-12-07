package projecteuler;
import java.util.*;public class MultiplesOf3Or5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 3 ;i < n ;i++) {
			if(i % 3 == 0 || i % 5 == 0)
				sum += i;
			}
		System.out.println(sum);
		}
}