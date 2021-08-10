import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grades = Double.parseDouble(scanner.nextLine());

        printInWords(grades);
    }

    private static void printInWords(double grades) {
        if(grades >= 2.00 && grades <= 2.99){
            System.out.println("Fail");
        }else if (grades >=3.00 && grades <= 3.49){
            System.out.println("Poor");
        }else if (grades >=3.49 && grades <= 4.49){
            System.out.println("Good");
        }else if (grades >=4.49 && grades <= 5.49){
            System.out.println("Very good");
        }else if (grades >=5.49 && grades <= 6.00){
            System.out.println("Excellent");
        }
    }
}
