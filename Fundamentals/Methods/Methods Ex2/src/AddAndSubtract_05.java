import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int sum = addTheNumbers(a,b);

        int totalSum = sum - c;
        System.out.println(totalSum);
    }

    private static int addTheNumbers(int a, int b) {

        return a + b;
    }
}
