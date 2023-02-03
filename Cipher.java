import java.util.Scanner;

class AffineCipher
{
    // This array stores the characters after the affine-cipher.
    // It stores the "Cipher-Version" for each of the characters from 'a' to 'z'.
    static char cipherChars[] = new char[26];

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the string to be encrypted: ");
        String input = in.nextLine().toLowerCase();
        System.out.println("Enter the keys: ");
        int k1 = in.nextInt(), k2 = in.nextInt();

        // Populating the array that stores the "Cipher Version" for each of the characters.
        for(int i = 0; i < 26; i++)
            cipherChars[i] = (char)('A' + (i * k1 + k2) % 26);

        String encrypted = encrypt(input);
        String decrypted = decrypt(encrypted);

        System.out.println("Original String: " + input);
        System.out.println("Encrypted String: " + encrypted);
        System.out.println("Decrypted String: " + decrypted);
        in.close();
    }

    private static String encrypt(String plaintext) {
        // the encryption process
        for(int i = 0; i < 26; i++) plaintext = plaintext.replace((char)('a' + i), cipherChars[i]);
        return plaintext; // here it has already gone through the encryption process
    }

    private static String decrypt(String ciphertext) {
        // the decryption process
        for(int i = 0; i < 26; i++) ciphertext = ciphertext.replace(cipherChars[i], (char)('a' + i));
        return ciphertext; // here it has already been decrypted and we just return it.
    }
}