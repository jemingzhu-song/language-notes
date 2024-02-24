package Basics;

public class Functions {
    public static void main(String[] args) {
        System.out.println(getGrade(20, false)); // FL
        System.out.println(getGrade(20, false)); // PS
    }

    public static String getGrade(int mark, boolean special) {
        if (mark < 50) {
            if (special) {
                return "PS";
            } else {
                return "FL";
            }
        } else if (mark >= 50 && mark < 75) {
            return "CR";
        } else if (mark >= 75 && mark < 85) {
            return "DS";
        } else if (mark >= 85 && mark <= 100) {
            return "HD";
        } else {
            return "NA";
        }
    }
}
