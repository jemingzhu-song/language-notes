package Basics;


public class Arrays {
    public static void main(String [] args) {
        /*
            To declare an array, use the following syntax:
                dataType[] arrayName
                    - dataType: can be primitive data types like: int, char, double, etc. or 
                                it can be Java Objects
                    - arrayName: name of the array
        */
        // Declare the array "data"
        double[] data;
        // Allocate memory (i.e. initialise size of the array)
        data = new double[10]; // This can also be done in a single line, i.e. double[] data = new double[10]
        /*
            NOTE: You cannot change the size of an array once it has been declared. The only way
            to modify the size is to copy the elements of an array into a new array with a different
            size, or to use "ArrayList" instead.
        */
        // Initialise an Array
        int[] age = {12, 2, 4, 19, 8, 23};
        // Access Elements of the Array
        System.out.println("0th: " + age[0] + " 1st: " + age[1] + " 2nd: " + age[2]);
        /*
            Multidimensional Arrays.
            To create a 2D array, use this expression:
                dataType[][] arrayName
        */
        int[][] a = {{1,2,3}, {5,2,3}, {2,3}};
        // Calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
        // Print all the elements of the 2D array
        for (int i = 0; i < a.length; i++) {
            System.out.println("Row: " + i + " of array...");
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}
