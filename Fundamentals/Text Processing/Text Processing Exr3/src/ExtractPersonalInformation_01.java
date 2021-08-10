import java.util.Scanner;

public class ExtractPersonalInformation_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int repetition = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < repetition; i++) {
            String person = scanner.nextLine();

            int indexBefore = person.indexOf('@');
            int indexAfter = person.indexOf('|');

            String name = person.substring(indexBefore + 1, indexAfter);

            int ageBefore = person.indexOf('#');
            int ageAfter = person.indexOf('*');

            String age = person.substring(ageBefore + 1,ageAfter);

            System.out.printf("%s is %s years old.%n",name,age);
        }
    }
}



