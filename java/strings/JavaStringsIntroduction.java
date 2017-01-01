import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(str1.length() + str2.length());
        System.out.println(str1.compareTo(str2) > 0 ? "Yes" : "No");
        System.out.format("%s %s", capFirstLetter(str1), capFirstLetter(str2));

    }

    private static String capFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}

