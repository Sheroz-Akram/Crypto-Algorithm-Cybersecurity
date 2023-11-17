package Algorithm;
import java.util.ArrayList;

public class CaesarCipherAlgorithm extends AbstractCryptoAlgorithm {

    // Set the Menu Options for the Current Algorithm
    public CaesarCipherAlgorithm(){
        optionList = new ArrayList<String>();
        optionList.add("Encrypt");
        optionList.add("Decrypt");
    }

    @Override
    public void displayInfo() {
        clrscr();
        System.out.println("*** Caesar Cipher Algorithm ***");
        System.out.println(
                "1. The Caesar Cipher is a simple and ancient encryption technique that shifts characters in a message by a fixed key to obscure the original text.\r\n"
                        + //
                        "2. It is named after Julius Caesar, who is believed to have used this method to protect sensitive information in his correspondence.");
    }

    @Override
    public String encrypt(String key, String plainText) {
        try {

            // Convert String to Integer
            int shift = Integer.parseInt(key);

            // Check Range
            if (shift < 1 || shift > 25) {
                throw new IllegalArgumentException("Key must be an integer between 1 and 25.");
            }

            StringBuilder encryptedText = new StringBuilder();

            // Change Plain to Cipher Text According to Key
            for (char c : plainText.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isUpperCase(c) ? 'A' : 'a';
                    encryptedText.append((char) ((c - base + shift) % 26 + base));
                } else {
                    // If it's not a letter, keep it unchanged.
                    encryptedText.append(c);
                }
            }

            return encryptedText.toString();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid key. Key must be a valid integer.");
        }
    }

    @Override
    public String decrypt(String key, String cipherText) {
        try {
            // Parse the key as an integer.
            int shift = Integer.parseInt(key);

            // Check if the key is within the valid range (1 to 25).
            if (shift < 1 || shift > 25) {
                throw new IllegalArgumentException("Key must be an integer between 1 and 25.");
            }

            // Create a StringBuilder to store the decrypted text.
            StringBuilder decryptedText = new StringBuilder();

            // Iterate through each character in the ciphertext.
            for (char c : cipherText.toCharArray()) {
                if (Character.isLetter(c)) {
                    // Determine the character base (upper or lower case).
                    char base = Character.isUpperCase(c) ? 'A' : 'a';

                    // Decrypt the character by shifting it in reverse.
                    decryptedText.append((char) ((c - base - shift + 26) % 26 + base));
                } else {
                    // If it's not a letter, keep it unchanged.
                    decryptedText.append(c);
                }
            }

            // Return the decrypted plain text.
            return decryptedText.toString();
        } catch (NumberFormatException e) {
            // Throw an exception if the key is not a valid integer.
            throw new IllegalArgumentException("Invalid key. Key must be a valid integer.");
        }
    }

}
