import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SockMerchant {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Integer socks = in.nextInt();
        List<Integer> list = new ArrayList<>();
        Integer matchingPairs = 0;

        while (socks > 0) {
            Integer color = in.nextInt();
            if (list.contains(color)) {
                list.remove(color);
                matchingPairs++;
            } else {
                list.add(color);
            }
            socks--;
        }
        System.out.println(matchingPairs);
    }

}

