import java.io.*;
import java.util.*;

public class UtopianTree {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Integer testCases = in.nextInt();
        List<Integer> list = new ArrayList<>();

        while (testCases > 0) {
            Integer cycles = in.nextInt();
            list.add(foo(cycles));
            testCases--;
        }
        list.stream().forEach(System.out::println);
    }

    private static Integer foo(Integer cycles) {
        Integer sapling = 1;
        for (int i = 1; i <= cycles; i++) {
            if (i % 2 == 0) {
                sapling += 1;
            } else {
                sapling *= 2;
            }
        }
        return sapling;
    }
}
