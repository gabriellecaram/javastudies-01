//data reading
//1st: import java.util.Scanner to use Scanner library
//2nd: initialize Scanner scannerName = new Scanner(System.in);
//     it's responsible for reading all types of data during the application.
//3rd: anytime we need to read some data,
//     we use String stringName = scanner.nextLine(), or nextInt, nextDouble, and from this on..


import java.util.Scanner; //importing library so we can use Scanner class.
public class Reading {
    public static void main(String[] args) { //shortcut: main = Enter, or psvm + Enter
        Scanner reading = new Scanner(System.in);

        System.out.println("Type your favorite movie");
        String movieName = reading.nextLine();
        //System.out.println(movieName);

        System.out.println("When was this movie released?");
        int year = reading.nextInt();
        //System.out.println("release date: " + year);

        System.out.println("Movie rate:");
        double rate = reading.nextDouble();

        System.out.println("Movie: " + movieName + "\nRelease year: " + year + "\nRate: "+rate);

        //scanner.close(); it's not working
    }
}
