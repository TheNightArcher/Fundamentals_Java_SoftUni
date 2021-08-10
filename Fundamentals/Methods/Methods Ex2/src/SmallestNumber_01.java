import java.util.Scanner;

public class SmallestNumber_01 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

      int printNumber = compereNumbers(a,b,c);
        System.out.println(printNumber);
    }

    private static int compereNumbers(int a, int b, int c) {

        if (a <= b && a <= c){
            return a;
        }else if (b <= a && b <= c){
            return b;
        }
        return c;
    }
}
