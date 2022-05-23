package Basics;
// Notes
/*
    0. Difference between JRE, JDK, JVM: https://www.programiz.com/java-programming/jvm-jre-jdk
       JDK -> JRE -> JVM (i.e. JVM is a subset of JRE, JRE is a subset of JDK)
    1. The name of the Java File MUST match the Class Name. In this case, our class is "Main", hence
      the file name must be "Main.java". The class name is case sensitive.
    2. The main() method is required - any code inside the main() method will be executed.
*/

// To Run...
/*
    1. Compile the file by running: "javac Main.java"
    2. Run the file by running: "java Main.java"
*/
public class Main {
    public static void main(String [] args) {
        System.out.println("Hello World!");
        System.out.print("Print but without putting a new line at the end of this sentence.");
    }
}
