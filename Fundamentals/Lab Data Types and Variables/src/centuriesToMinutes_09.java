import java.util.Scanner;

public class centuriesToMinutes_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());

        int year = centuries * 100;
        double days = year * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes",centuries,year,days,hours,minutes);
    }
}
