import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());


        double bestBonus = 0;
        int attendedTimes = 0;


        for (int i = 0; i < countOfStudents; i++) {

            int studentAttended = Integer.parseInt(scanner.nextLine());

            double calculateBonus = Math.ceil(studentAttended * 1.0 / countOfLectures * (5 + additionalBonus));
            if (bestBonus < calculateBonus ){
                bestBonus = calculateBonus;
                attendedTimes = studentAttended;
            }


        }

        System.out.printf("Max Bonus: %.0f.%n",bestBonus);
        System.out.printf("The student has attended %d lectures.",attendedTimes);
    }
}
