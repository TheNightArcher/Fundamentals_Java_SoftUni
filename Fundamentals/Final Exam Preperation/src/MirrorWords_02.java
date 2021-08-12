import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MirrorWords_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String regex = "(?<seperator>[@|#])(?<words>[A-Za-z]{3,})\\1\\1(?<mirror>[A-Za-z]{3,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        Map<String,String> result = new LinkedHashMap<>();
        int counter = 0;
        while (matcher.find()) {
            counter++;
            StringBuilder secondWordReversed = new StringBuilder();
            String firstWord = matcher.group("words");
            String secondWord = matcher.group("mirror");

            secondWordReversed.append(secondWord).reverse();
            if (firstWord.equals(secondWordReversed.toString())) {
                result.put(firstWord,secondWord);
            }
        }
        if (counter > 0){
            System.out.printf("%d word pairs found!%n",counter);
        }else {
            System.out.println("No word pairs found!");
        }
        if (result.isEmpty()){
            System.out.println("No mirror words!");
        }else {
            System.out.println("The mirror words are:");
        }
        counter = 0;
        for (var word:result.entrySet()) {
            counter++;
            if (counter > result.size() -1){
                System.out.printf("%s <=> %s",word.getKey(),word.getValue());
            }else {
                System.out.printf("%s <=> %s, ",word.getKey(),word.getValue());
            }
        }
    }
}
