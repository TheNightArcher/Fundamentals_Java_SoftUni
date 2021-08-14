import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ThePianist_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfPieces = Integer.parseInt(scanner.nextLine());

        PiecesDate newPieces;
        Map<String, PiecesDate> currentPieces = new TreeMap<>();
        for (int i = 0; i < numberOfPieces; i++) {

            String piecesInput = scanner.nextLine();
            String[] piecesSplit = piecesInput.split("\\|");

            String pieces = piecesSplit[0];
            String composer = piecesSplit[1];
            String key = piecesSplit[2];

            newPieces = new PiecesDate(composer, key);
            currentPieces.put(pieces, newPieces);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] inputSplit = input.split("\\|");
            String command = inputSplit[0];
            String pieces = inputSplit[1];

            switch (command) {
                case "Add":
                    String composer = inputSplit[2];
                    String key = inputSplit[3];

                    if (currentPieces.containsKey(pieces)) {
                        System.out.printf("%s is already in the collection!%n", pieces);
                    } else {
                        newPieces = new PiecesDate(composer, key);
                        currentPieces.put(pieces, newPieces);
                        System.out.printf("%s by %s in %s added to the collection!%n", pieces, composer, key);
                    }
                    break;
                case "Remove":
                    if (currentPieces.containsKey(pieces)) {
                        currentPieces.remove(pieces);
                        System.out.printf("Successfully removed %s!%n", pieces);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieces);
                    }
                    break;
                case "ChangeKey":
                    String newKey = inputSplit[2];
                    if (currentPieces.containsKey(pieces)) {
                        currentPieces.get(pieces).setKey(newKey);
                        System.out.printf("Changed the key of %s to %s!%n", pieces, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieces);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        currentPieces.forEach((key, value) -> System.out.printf("%s -> Composer: %s, Key: %s%n", key, value.getComposer(), value.getKey()));
    }
}

class PiecesDate {
    private final String composer;
    private String key;

    public PiecesDate(String composer, String key) {
        this.composer = composer;
        this.key = key;
    }

    public String getComposer() {
        return composer;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
