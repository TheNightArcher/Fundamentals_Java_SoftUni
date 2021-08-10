import java.util.Scanner;

public class Left_Right_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int repetition = Integer.parseInt(scanner.nextLine()); 

        for (int i = 0; i < repetition; i++) {

            String[] input = scanner.nextLine().split(" ");

            int digitSum = 0;

            long leftNumbers = Long.parseLong(input[0]);
            long rightNumbers = Long.parseLong(input[1]);

            if (leftNumbers >= rightNumbers) {
                for (int j = 0; j < input[0].length(); j++) {
                    digitSum += Math.abs(leftNumbers % 10);
                    leftNumbers /= 10;
                }
            }else {
                for (int j = 0; j < input[1].length() ; j++) {
                    digitSum += Math.abs(rightNumbers % 10);
                    rightNumbers /= 10;
                }
            }

            System.out.println(digitSum);
        }


    }
}
