import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int beautifulDays = 0;

        for (int z = i; z <= j; z++) {
            if (calculate(z, k)) {
                beautifulDays++;
            }
        }
        System.out.println(beautifulDays);

    }

    static boolean calculate(int num, int k) {
        if ((num - reverse(num)) % k == 0) {
            return true;
        }
        return false;
    }

    static int reverse(int num) {
        String a = new StringBuilder(String.valueOf(num)).reverse().toString();
        return Integer.valueOf(a);
    }
}
