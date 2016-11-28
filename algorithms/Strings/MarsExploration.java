import java.util.Scanner;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String receivedSignal = in.next();
        int changedLetters = 0;

        for (int i = 0; i < receivedSignal.length(); i++) {
            if (receivedSignal.charAt(i) != "SOS".charAt(i % 3)) {
                changedLetters++;
            }
        }
        System.out.println(changedLetters);
    }
}

