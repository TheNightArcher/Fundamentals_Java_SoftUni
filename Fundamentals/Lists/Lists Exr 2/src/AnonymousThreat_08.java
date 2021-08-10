
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("3:1")) {

            String[] date = input.split("\\s+");

            String operationDate = date[0];

            if (operationDate.equals("merge")) {

                int startIndex = Integer.parseInt(date[1]);
                int lastIndex = Integer.parseInt(date[2]);


                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (lastIndex > names.size() - 1) {
                    lastIndex = names.size() - 1;
                }

                boolean isValidIndex = isValidStart(startIndex, names.size());
                boolean isValidIndexEnd = isValidStart(lastIndex, names.size());

                if (isValidIndex && isValidIndexEnd) {

                    StringBuilder resultMerge = new StringBuilder();

                    for (int i = startIndex; i <= lastIndex; i++) {

                        resultMerge.append(names.get(i));
                    }

                    for (int i = startIndex; i <= lastIndex; i++) {

                        names.remove(startIndex);
                    }
                    names.add(startIndex, resultMerge.toString());

                }

            } else if (operationDate.equals("divide")) {

                int index = Integer.parseInt(date[1]);
                int partition = Integer.parseInt(date[2]);

                String divideElements = names.get(index);

                names.remove(index);   //{abcdef, ghi, jkl} -> {ghi, jkl}

                int partSize = divideElements.length() / partition;  //"abcdef" -> 6 / 3 = 2

                int begin = 0;

                for (int i = 1; i < partition; i++) {
                    names.add(index, divideElements.substring(begin, begin + partSize));
                    index++;
                    begin += partSize;
                }

                names.add(index, divideElements.substring(begin));
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", names));
    }

    private static boolean isValidStart(int startIndex, int size) {

        return startIndex >= 0 && startIndex <= size - 1;
    }
}
