import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int biscuitsPerDay = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int lastMonthProduct = Integer.parseInt(scanner.nextLine());


        int currentMonth = 0;


        for (int i = 1; i <= 30; i++) {
            double productPerDay = workers * biscuitsPerDay;
            if (i % 3 == 0) {
                productPerDay = productPerDay * 0.75;
                currentMonth += productPerDay;
            } else {
                currentMonth += productPerDay;
            }

        }

        if (currentMonth > lastMonthProduct) {
            System.out.printf("You have produced %d biscuits for the past month.%n", currentMonth);
            double diff = currentMonth - lastMonthProduct;
            double left = diff / lastMonthProduct * 100;
            System.out.printf("You produce %.2f percent more biscuits.", left);
        } else {
            System.out.printf("You have produced %d biscuits for the past month.%n",currentMonth);
            double diff = lastMonthProduct - currentMonth;
            double left = diff / lastMonthProduct * 100;
            System.out.printf("You produce %.2f percent less biscuits.", left);
        }
    }
}
