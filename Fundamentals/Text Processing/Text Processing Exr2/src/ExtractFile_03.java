import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] document = scanner.nextLine().split("\\\\");


        for (String location : document) {
            if (location.contains(".")) {
                String name = location.split("\\.")[0];
                String extension = location.split("\\.")[1];

                System.out.printf("File name: %s%n", name);
                System.out.printf("File extension: %s", extension);
            }
        }

    }
}
