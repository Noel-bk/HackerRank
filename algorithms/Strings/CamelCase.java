import java.util.Scanner;

public class CamelCase{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Long cnt = s.chars()
            .filter(
                    c -> Character.isUpperCase((char) c)
                   ).count() + 1;

        System.out.print(cnt);
    }

}
