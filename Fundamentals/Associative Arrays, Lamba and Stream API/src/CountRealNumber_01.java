import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumber_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double,Integer> counter = new TreeMap<>();


        for (double num : numbers) {
            if (!counter.containsKey(num)){
                counter.put(num,1);
            }else {
                counter.put(num,counter.get(num) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry: counter.entrySet()) {

            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
