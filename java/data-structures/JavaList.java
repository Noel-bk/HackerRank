import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int val = scan.nextInt();
            list.add(val);
        }

        int queries = scan.nextInt();

        for (int i = 0; i < queries; i++) {
            String query = scan.next();
            if ("insert".equalsIgnoreCase(query)) {
                int idx = scan.nextInt();
                int val = scan.nextInt();
                list.add(idx, val);
            }
            if ("delete".equalsIgnoreCase(query)) {
                int idx = scan.nextInt();
                list.remove(idx);
            }
        }
        scan.close();
        for (Integer val : list) {
            System.out.format("%d ", val);
        }
    }

}

