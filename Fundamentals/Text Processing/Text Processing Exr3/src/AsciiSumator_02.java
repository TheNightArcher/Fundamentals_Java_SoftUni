import java.util.Scanner;

public class AsciiSumator_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char input = scanner.nextLine().charAt(0);
        char secondInput = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();


        int sum = 0;
        for (char word: text.toCharArray()) {

            if (input < word && word < secondInput){

                sum +=word;
            }
        }

        System.out.println(sum);
    }
}
