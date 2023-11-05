package Algorithm;

import java.io.IOException;
import java.util.List;

/**
 * An abstract base class for cryptographic algorithms that provides methods
 * for encryption and decryption of data.
 */
public abstract class AbstractCryptoAlgorithm {

    // Store the List of Availible Options for current Algorithms
    public List<String> optionList = null;

    /**
     * Display all the required information about some specific algorithms
     */
    public abstract void displayInfo();

    /**
     * Encrypts the given plain text using the provided key.
     *
     * @param key The encryption key to use.
     * @param plainText The plain text to be encrypted.
     * @return The encrypted ciphertext.
     */
    public abstract String encrypt(String key, String plainText);

    /**
     * Decrypts the given ciphertext using the provided key.
     *
     * @param key The decryption key to use.
     * @param cipherText The ciphertext to be decrypted.
     * @return The decrypted plain text.
     */
    public abstract String decrypt(String key, String cipherText);

    /**
     * Clears Screen in java
     */
    public static void clrscr(){
    try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {}
}
}
