import java.util.Scanner;

public class SnowBalls_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short numberOfBalls = Short.parseShort(scanner.nextLine());

        double biggest = Double.MIN_VALUE;

        int snow = 0;
        int time = 0;
        int quality = 0;

        for (int i = 0; i < numberOfBalls; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

           double sum =  Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);

            if (sum > biggest) {
                biggest = sum;
                snow = snowballSnow;
                time = snowballTime;
                quality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d) ",snow,time,biggest,quality);
    }
}
