import java.util.Scanner;

public class JavaStringCompare {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.next();
        int substr = in.nextInt();
        answer(str, substr);

    }

    static void answer(String str, int max) {
        String minSubstr = str.substring(0, max);
        String maxSubstr = str.substring(0, max);
        for (int i = 0; i < str.length() + 1 - max; i++) {
            if (maxSubstr.compareTo(str.substring(i, i + max)) < 0) {
                maxSubstr = str.substring(i, i + max);
            }
            if (minSubstr.compareTo(str.substring(i, i + max)) > 0) {
                minSubstr = str.substring(i, i + max);
            }
        }
        System.out.println(minSubstr);
        System.out.println(maxSubstr);
    }

}

