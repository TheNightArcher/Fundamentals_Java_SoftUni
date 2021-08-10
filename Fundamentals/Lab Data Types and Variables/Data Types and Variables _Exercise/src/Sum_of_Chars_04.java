import java.util.Scanner;

public class Sum_of_Chars_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int timesRotation = Integer.parseInt(scanner.nextLine());


        int sum = 0;

        for (int i = 0; i <timesRotation ; i++) {
            char letters = scanner.nextLine().charAt(0);
             sum += letters;
        }

        System.out.printf("The sum equals: %d",sum);
    }
}
