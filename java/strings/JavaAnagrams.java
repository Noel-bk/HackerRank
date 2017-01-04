import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaAnagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        boolean ret = isAnagram1(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }

    // Java 8 Stream and Collector
    static boolean isAnagram1(String a, String b) {

        Map<Character, Integer> frequencies1 = a.toLowerCase()
            .chars()
            .boxed()
            .collect(Collectors.toMap(
                // key = char
                k -> Character.valueOf((char) k.intValue()),
                v -> 1,         // 1 occurence
                Integer::sum)); // counting

        Map<Character, Integer> frequencies2 = b.toLowerCase()
            .chars()
            .boxed()
            .collect(Collectors.toMap(
                // key = char
                k -> Character.valueOf((char) k.intValue()),
                v -> 1,         // 1 occurence
                Integer::sum)); // counting

        return frequencies1.equals(frequencies2);

    }

    // foreach with Java 8 Map.merge()
    static boolean isAnagram2(String a, String b) {

        Map<Character, Integer> freqs1 = new HashMap<>();
        for (char c : a.toLowerCase().toCharArray()) {
            freqs1.merge(c,                  // key = char
                1,                  // value to merge
                Integer::sum);      // counting
        }

        Map<Character, Integer> freqs2 = new HashMap<>();
        for (char c : b.toLowerCase().toCharArray()) {
            freqs2.merge(c,                  // key = char
                1,                  // value to merge
                Integer::sum);      // counting
        }

        return freqs1.equals(freqs2);
    }

}
