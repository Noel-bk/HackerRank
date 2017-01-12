import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        try {
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println(e);
        } 
    }
}

