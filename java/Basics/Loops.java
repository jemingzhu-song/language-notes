package Basics;

public class Loops {
    public static void main(String [] args) {
        /*
            Syntax 1
        */
        int maxLength = 10;
        for (int i = 0; i < maxLength; i++) {
            System.out.println(i);
        }
        /*
            Syntax 2
        */
        String [] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
