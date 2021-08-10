import java.util.Scanner;

public class Refactor_SumOf_Odds_13 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int counter = 0;
        for (int i = 0; i <= 100 ; i++) {
            if (i % 2 != 0 && counter < n){

                sum += i;
                System.out.printf("%d%n",i);
                counter++;
            }
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
