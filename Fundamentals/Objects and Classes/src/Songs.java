import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numbersOfSongs = Integer.parseInt(scanner.nextLine());

        List<classSongs> songs = new ArrayList<>();

        for (int i = 0; i < numbersOfSongs; i++) {


            String[] date = scanner.nextLine().split("_");

            String type = date[0];
            String name = date[1];
            String time = date[2];


            classSongs song = new classSongs(type, name, time);
            songs.add(song);
        }
        String type = scanner.nextLine();

        if (type.equals("all")) {
            for (classSongs song : songs) {
                System.out.println(song);
            }
        } else {
            for (classSongs song : songs) {
                if (song.getTypeList().equals(type)) {
                    System.out.println(song);
                }
            }
        }

    }
}


class classSongs {

    private String typeList;
    private String name;
    private String time;

    public classSongs(String typeList, String name, String time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    public String getTypeList(){
        return this.typeList;
    }

    public String toString(){
        return this.name;
    }
}


