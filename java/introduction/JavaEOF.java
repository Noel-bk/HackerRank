import java.util.Scanner;

public class JavaEOF {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int i = 1; 
        while (sc.hasNext()) {
            System.out.format("%d %s\n", i, sc.nextLine());
            i++;
        } 
    }
}

