import java.util.Scanner;
class AffineCipher {
	static Scanner sc = new Scanner(System.in);
	static String encrypt(String msg) {
//		System.out.println("Enter first key to encrypt : ");
//		int k1 = sc.nextInt();
//		System.out.println("Enter second key to encrypt : ");
//		int k2 = sc.nextInt();
		int k1 = 3;
		int k2 = 6;
		String cTxt = "";
		for(int i = 0;i<msg.length();i++) {
			cTxt = cTxt + (char)((((msg.charAt(i) * k1) + k2) % 26) + 65);
		}
		return cTxt;
	}
	static int inverse(int num1,int num2) {
		int temp1 = num1;
		int temp2 = num2;
		while(temp2%temp1 != 0) {    //code to check the gcd
			int rem = temp2%temp1;
			temp2 = temp1;
			temp1 = rem;
		}
		if(temp1 == 1) {
			for(int i = 1;i<num2;i++) {
				if(((num1*i)-1)%num2 == 0)
					return i;
			}
		}
		return -1;
	}
	static String decrypt(String cTxt) {
//		System.out.println("Enter first key to decrypt : ");
//		int k1 = sc.nextInt();
//		System.out.println("Enter second key to decrypt : ");
//		int k2 = sc.nextInt();
		int k1 = 3;
		int k2 = 6;
		String msg = "";
		int k1_inv = inverse(k1,26);
		for(int i = 0;i<cTxt.length();i++) {
			msg = msg + (char)((((cTxt.charAt(i) - k2) * k1_inv)%26) + 65);
		}
		return msg;
	}

	public static void main(String[] args) {
		String msg = sc.next();
		System.out.println("message is "+msg);
		String a = encrypt(msg);
		System.out.println("encrypted message is "+a);
		System.out.println("Decrypted message is "+decrypt(a));
//		int k1_inv = inverse(15,7);
//		System.out.println(k1_inv);
	}

}
