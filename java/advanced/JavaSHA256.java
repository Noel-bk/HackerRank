import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password = sc.next();

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(password.getBytes());
        byte[] digest = md.digest();
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }

    }
}

