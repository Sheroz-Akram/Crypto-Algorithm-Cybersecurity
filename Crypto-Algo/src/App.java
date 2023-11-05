import Algorithm.*;

public class App {
    public static void main(String[] args) throws Exception {
        CaesarCipherAlgorithm c = new CaesarCipherAlgorithm();
        c.displayInfo();
        System.out.println(c.decrypt("10", c.encrypt("10", "hey Secrect")));
    }
}
