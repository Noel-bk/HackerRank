import java.io.*;
import java.util.*;

public class BonAppetit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer ordered = in.nextInt();
        Integer didNotEat = in.nextInt();
        Integer total = 0;

        for (int i = 0; i < ordered; i++) {
            Integer cost = in.nextInt();
            if (i == didNotEat) {
                continue;
            }
            total += cost;
        }
        total = total / 2;
        Integer charged = in.nextInt();

        if (total < charged) {
            System.out.println((charged - total));
        } else {
            System.out.println("Bon Appetit");
        }
    }
}
