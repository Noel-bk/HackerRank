import java.util.Scanner;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        String binaryString = in.next();
        String substring = "010";

        long steps = binaryString
            .replace(substring, "X")
            .chars()
            .filter(
                    value -> value == 'X'
                   ).count();

        System.out.println(steps);

    }
}
