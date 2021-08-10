import java.util.Scanner;

public class LowerToUpper_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String letter = scanner.nextLine();

       if (letter.equals(letter.toUpperCase())){
           System.out.println("upper-case");
       }else if (letter.equals(letter.toLowerCase())){
           System.out.println("lower-case");
       }
    }
}
