//loop using while

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double average =0;
        double rate=0;
        int i=0;

        while (rate != -1) {
            System.out.println("Movie rate: ");
            rate = reading.nextDouble();

            if(rate!=-1){
                average = average + rate;
                i++;
            }
        }

        average = average / i;

        System.out.println("rating average: " + average);
    }
}
