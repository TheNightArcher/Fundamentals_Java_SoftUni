import java.util.Scanner;

public class SoftUni_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int firstEmployer = Integer.parseInt(scanner.nextLine());
        int secondEmployer = Integer.parseInt(scanner.nextLine());
        int thirdEmployer = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());


        int allEmployers = firstEmployer + secondEmployer + thirdEmployer;

        int counter = 0;
        while (studentCount > 0) {

            counter++;


            if (counter % 4 == 0){
                counter++;
            }


                studentCount -= allEmployers;


        }

        System.out.printf("Time needed: %dh.",counter);

    }
}
