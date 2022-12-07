package projecteuler;

import java.math.BigInteger;
public class PowerDIgitSum {
	public static void main(String[] args) {
		System.out.println(new PowerDIgitSum().run());
		}
	private String run() {
		String temp = BigInteger.ONE.shiftLeft(1000).toString();
		int sum=0;
		for(int i=0;i<temp.length();i++)
			sum+=temp.charAt(i) -'0';
		return Integer.toString(sum);
		}	
}
