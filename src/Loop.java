import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double average =0;
        double rate;

        for (int i = 0; i < 5; i++) {
            System.out.println("Movie rate: ");
            rate = reading.nextDouble();
            average = average + rate;
        }

        average = average / 5;

        System.out.println("rating average: " + average);
    }
}
