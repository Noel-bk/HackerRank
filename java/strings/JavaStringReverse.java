import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        checkPalindrome(str);

    }

    static void checkPalindrome(String str) {
        if(str.equals(new StringBuilder(str).reverse().toString())){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
