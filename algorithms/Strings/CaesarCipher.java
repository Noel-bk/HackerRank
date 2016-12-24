import java.io.StringWriter;
import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String unencrypted = in.next();
        int toRotate = in.nextInt();

        String result = unencrypted.chars()
            .map(
                c -> {
                    if (c >= 'a' && c <= 'z') {
                        return 97 + ((c + toRotate - 97) % 26);
                    } else if (c >= 'A' && c <= 'Z') {
                        return 65 + ((c + toRotate - 65) % 26);
                    } else {
                        return c;
                    }
                })
            .collect(StringWriter::new, StringWriter::write, (l, r) -> l.write(r.toString()))
            .toString();

        System.out.println(result);

    }
}

