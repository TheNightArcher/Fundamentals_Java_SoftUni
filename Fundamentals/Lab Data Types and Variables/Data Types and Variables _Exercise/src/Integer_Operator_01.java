import java.util.Scanner;

public class Integer_Operator_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstInt = Integer.parseInt(scanner.nextLine());
        int secondInt = Integer.parseInt(scanner.nextLine());
        int thirdInt = Integer.parseInt(scanner.nextLine());
        int fourthInt = Integer.parseInt(scanner.nextLine());

        int sum = ((firstInt + secondInt) / thirdInt ) * fourthInt;

        System.out.println(sum);
    }
}
