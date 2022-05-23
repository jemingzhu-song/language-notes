package Basics;

public class Switches {
    public static void main(String[] args) {
        /*
            The switch statement allows us to execute a block of code among many alternatives.
            The syntax for this is:
                - "expression" is evaluated once and compared with the values of each case
                - If expression matches with "value1", the code of case "value1" are executed. 
                    Similarly, the code of case "value2" is executed if expression matches with "value2".
                - If there is NO match, the code of the "default" case is executed.

            switch (expression) {
                case value1:
                    // code
                    break;
                case value2:
                    // code
                    break;
                ...
                ...
                default:
                    // default statements
            }
        */
        int day = 1;
        switch(day) {
            case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        }
    }
    
}
