import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); 
        HashMap<String, Integer> map = new HashMap<>(); 
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            map.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            try {
                int phone = map.get(s);
                System.out.println(s + "=" + phone);
            } catch (NullPointerException e) {
                System.out.println("Not found");
            }
        }
    }
}

