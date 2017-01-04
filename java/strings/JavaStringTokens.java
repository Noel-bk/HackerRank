import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        answer(str);
        scan.close();
    }

    static void answer(String str) {
        if (str.trim().equals("")) {
            System.out.println(0);
            return;
        }
        String[] output = str.trim().split("[ !,?._'@]+");
        System.out.println(output.length);
        for (String s : output) {
            System.out.println(s);
        }
    }

}

