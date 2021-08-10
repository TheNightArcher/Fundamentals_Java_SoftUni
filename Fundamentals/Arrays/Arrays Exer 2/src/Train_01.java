import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumAllPeoples = 0;
        for (int wagons = 0; wagons < n; wagons++) {
            int peoplesInWagon = Integer.parseInt(scanner.nextLine());

            System.out.print(peoplesInWagon + " ");
            sumAllPeoples += peoplesInWagon;
        }
        System.out.println();
        System.out.println(sumAllPeoples);

    }
}
