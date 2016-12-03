import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        sentence = sentence.replaceAll(" ", "").toLowerCase();

        Set<Integer> set = new HashSet<>();

        sentence.chars()
            .distinct()
            .forEach(
                s -> set.add(s)
            );

        if (set.size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}
