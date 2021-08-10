import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String valuesType = scanner.nextLine();
        String firstV = scanner.nextLine();
        String secondV = scanner.nextLine();

        switch (valuesType) {
            case "int":
                int sum = intGreater(firstV, secondV);
                System.out.println(sum);
                break;
            case "char":
                char word = charGreater(firstV, secondV);
                System.out.println(word);
                break;
            case "string":
                String name = StringGreater(firstV, secondV);
                System.out.println(name);
                break;

        }
    }

    private static int intGreater(String firstV, String secondV) {

        int first = Integer.parseInt(String.valueOf(firstV));
        int second = Integer.parseInt(String.valueOf(secondV));

        return Math.max(first, second);
    }

    private static char charGreater(String firstV, String secondV) {

        char first = firstV.charAt(0);
        char second = secondV.charAt(0);

        if (first > second) {
            return first;
        }
        return second;
    }

    private static String StringGreater(String firstV, String secondV) {
        if (firstV.compareTo(secondV) >= 0)  {
            return firstV;
        }
        return secondV;
    }
}
