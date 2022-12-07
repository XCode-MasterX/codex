package projecteuler;
public class SpecialPythagoreanTriplet {
	public static void main(String[] args) {
		int a=0, b=0, c=0;
		boolean f = false;
		for (a = 0; a<=1000; a++){
			for (b = 0; b<=1000; b++)
			{
				for (c = 0; c<=1000; c++)
				{
					if ((a*a + b*b == c*c) && ((a+b+c) ==1000) && a != 0 && b != 0 && c != 0) {
						System.out.println(a*b*c);
						f = true;
						}
					if(f)break;
					}
				if(f)break;
				}
			if(f)break;
			}
		}
}