import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        calculate(a, b, c, d, e);
    }

    public static void calculate(long a, long b, long c, long d, long e) {
        List<Long> list = Arrays.asList(a, b, c, d, e);

        Long maxSum = list.stream()
            .sorted(Comparator.reverseOrder())
            .limit(4)
            .mapToLong(Long::longValue)
            .sum();

        Long minSum = list.stream()
            .sorted()
            .limit(4)
            .mapToLong(Long::longValue)
            .sum();

        System.out.format("%d %d", minSum, maxSum);
    }
}

