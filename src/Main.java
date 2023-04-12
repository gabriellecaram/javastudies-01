//first code in java
//sout, int, double, boolean, char, string, casting, format, text blocks, operators

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to ScreenMatch"); //shortcut = sout + enter
        System.out.println("Movie: Top Gun");

        //types
        int year = 2022;
        String title = "Top Gun"; //string is a class
        boolean signature = true; //true or false
        double rate = 8.1;
        double average;
        average = (rate + 10.0) / 2;
        System.out.println(average);
        String sinopse;

        //text blocks
        sinopse = """
                Top Gun: action movie
                Starring Tom Cruise
                Recap                    
                """;
        System.out.println(sinopse + "ano de lançamento " + year);

        //conditional
        if (title.equals("Top Gun 2")) {
            System.out.println("Authorized access");
        } else {
            System.out.println("Access denied");
        }

        //format
        System.out.println(String.format("Movie title %s, year %d, average %.2f", title, year, average));

        //casting
        int rating;
        rating = (int) (average/2); //casting explicito
        System.out.println(rating);

        //casting implicito
        //int x;
        //double y = x;
    }
}