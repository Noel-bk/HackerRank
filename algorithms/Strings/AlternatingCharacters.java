import java.util.Scanner;

public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        while (testCases > 0) {
            String input = in.next();
            char[] c = input.toCharArray();

            int deletions = 0;
            for (int i = 1; i < c.length; i++) {
                if (c[i] == c[i - 1]) {
                    deletions++;
                }
            }
            System.out.println(deletions);
            testCases--;
        }
    }
}
