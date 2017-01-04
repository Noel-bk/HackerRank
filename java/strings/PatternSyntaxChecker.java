import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            System.out.println((isValid(pattern)) ? "Valid" : "Invalid");
            testCases--;
        }
    }

    static boolean isValid(String str) {
        try {
            Pattern.compile(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

