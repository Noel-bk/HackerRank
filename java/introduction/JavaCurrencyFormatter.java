import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        //Write your code here.
        Locale uslocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        Locale inlocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        Locale chlocale = new Locale.Builder().setLanguage("zh").setRegion("CN").build();
        Locale frlocale = new Locale.Builder().setLanguage("fr").setRegion("FR").build();

        NumberFormat us = NumberFormat.getCurrencyInstance(uslocale);
        NumberFormat india = NumberFormat.getCurrencyInstance(inlocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(chlocale);
        NumberFormat france = NumberFormat.getCurrencyInstance(frlocale);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

    }
}

