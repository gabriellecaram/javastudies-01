//if else, switch case == in C

public class Conditional {
    public static void main(String[] args) {
        int year = 2022;
        boolean signature = true;
        double rate = 8.1;
        String planCategory = "plus";

        if (year >= 2022) {
            System.out.println("new movie");
        } else {
            System.out.println("old movie");
        }

        //String comparison
        if (signature == true || planCategory.equals("plus")) { //to compare Strings dont use: ==, use: variable.equals("");
            System.out.println("authorized access");
        } else {
            System.out.println("payment required");
        }

        //Switch case: example 1
        switch (year){
            case 2022:
                System.out.println("last year");
                break;
            case 2023:
                System.out.println("new movie");
                break;
            default:
                System.out.println("old movies");
                break;
        }

        //switch case: example 2

        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "sunday";
                break;
            case 2:
                dayName = "monday";
                break;
            case 3:
                dayName = "tuesday";
                break;
            case 4:
                dayName = "wednesday";
                break;
            case 5:
                dayName = "thursday";
                break;
            case 6:
                dayName = "friday";
                break;
            case 7:
                dayName = "saturday";
                break;
            default:
                dayName = "invalid";
                break;
        }

        System.out.println("Day " + day + " is a " + dayName);
    }
}
