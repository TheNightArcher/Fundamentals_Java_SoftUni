import java.util.*;

public class AddOccurrence_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] words = scanner.nextLine().split(" ");

        Map<String,Integer> counts = new LinkedHashMap<>();
        List<String> odds = new ArrayList<>();

        for (String word: words) {

            String wordInLowerCase = word.toLowerCase();

            if (counts.containsKey(wordInLowerCase)){
                counts.put(wordInLowerCase,counts.get(wordInLowerCase) + 1);
            }else {
                counts.put(wordInLowerCase,1);
            }
        }

        for (var entry: counts.entrySet()) {
            if (entry.getValue() % 2 == 1){
                odds.add(entry.getKey());
            }
        }
        for (int i = 0; i < odds.size(); i++) {

            System.out.print(odds.get(i));
            if (i < odds.size() -1){
                System.out.print(", ");
            }
        }


    }
}
