import java.io.*;
import java.util.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer testCases = in.nextInt();

        while (testCases > 0) {

            Integer cnt = 0;
            Integer students = in.nextInt();
            Integer threshold = in.nextInt();

            for (int i = 0; i < students; i++) {
                Integer arrival = in.nextInt();
                if (arrival <= 0) {
                    threshold--;
                }
            }

            if (threshold <= 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

            testCases--;
        }
    }
}
