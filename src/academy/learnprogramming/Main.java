package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("My string is = " + myString);
        myString = myString + ", this is more.";
        System.out.println("myString is =  " + myString);
        myString = myString + " \u00A9 2020";
        System.out.println("myString is =  " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.94";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = myInt + lastString;
        System.out.println(lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);

    }
}
