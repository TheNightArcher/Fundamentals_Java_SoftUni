import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<StudentsClass> peoples = new ArrayList<>();


        String command = scanner.nextLine();

        while (!command.equals("end")){

            String[] students = command.split("\\s+");

            String firstName = students[0];
            String secondName = students[1];
            int age = Integer.parseInt(students[2]);
            String town = students[3];

            StudentsClass student = new StudentsClass(firstName,secondName,age,town);
            peoples.add(student);

            command = scanner.nextLine();
        }
        String town = scanner.nextLine();

        for (StudentsClass students: peoples) {
            if (students.getTown().equals(town)){
                System.out.println(students);
            }
        }
    }
}

class StudentsClass {

    private String firstName;
    private String secondName;
    private int age;
    private String town;

    public StudentsClass(String firstName, String secondName, int age, String town) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.town = town;
    }

    public String getTown() {
        return this.town;
    }

    @Override
    public String toString() {

        return firstName + " " + secondName + " " + "is " + age + " " + "years old";
    }
}


