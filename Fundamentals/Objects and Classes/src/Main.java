
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student_02> peoples = new ArrayList<>();


        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] students = command.split("\\s+");

            String firstName = students[0];
            String secondName = students[1];
            int age = Integer.parseInt(students[2]);
            String town = students[3];

            if (!isExist(firstName, secondName, age, town, peoples)) {

                Student_02 student = new Student_02(firstName, secondName, age, town);
                peoples.add(student);
            }
            command = scanner.nextLine();
        }
        String town = scanner.nextLine();

        for (Student_02 student: peoples) {

            if (student.getTown().equals(town)){
                System.out.println(student);
            }
        }
    }

    private static boolean isExist(String firstName, String secondName, int age, String town, List<Student_02> peoples) {
        for (Student_02 student : peoples) {

            boolean isFirstNameEqual = student.getFirstName().equals(firstName);
            boolean isSecondNameEqual = student.getSecondName().equals(secondName);

            if (isFirstNameEqual && isSecondNameEqual) {
                student.setAge(age);
                student.setTown(town);
                return true;
            }
        }
        return false;
    }
}