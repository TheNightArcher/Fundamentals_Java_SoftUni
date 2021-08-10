import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String  array1 = scanner.nextLine();
        String array2 = scanner.nextLine();

        String [] firstAr = array1.split(" ");
        String[] secondAr = array2.split(" ");

        for (String secondWord :secondAr  ) {
            for  ( String firstWord:firstAr ) {
                if (secondWord.equals(firstWord)){
                    System.out.print(secondWord + " ");
                }
            }
        }
    }
}
