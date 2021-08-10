import java.util.Scanner;

public class RepeatString_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        StringBuilder holder = new StringBuilder();

        for (String s : input) {

            int wordLength = s.length();
            holder.append(s.repeat(wordLength));
        }

        System.out.println(holder);
    }
}
