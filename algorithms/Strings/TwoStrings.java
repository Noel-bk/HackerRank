import java.util.HashSet;
import java.util.Scanner;

public class TwoStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pairs = in.nextInt();

        for (int i = 0; i < pairs; i++) {
            String s1 = in.next();
            String s2 = in.next();
            answer(s1, s2);
        }

    }

    private static void answer(String s1, String s2) {

        final boolean[] hasCommonSubstring = new boolean[1];
        HashSet<Character> h1 = new HashSet<>();

        s1.chars()
            .mapToObj(c -> h1.add((char) c))
            .count();

        h1.forEach(
            x -> {
                if (s2.contains(x.toString())) {
                    hasCommonSubstring[0] = true;
                    return;
                }
            }
        );

        if (hasCommonSubstring[0]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

