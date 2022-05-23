package OOP;

public class MethodOverriding {

}

/* Constructor "@Override Keyword"*/
class Complex {
    private int a, b;

    private Complex( int i, int j ){
        this.a = i;
        this.b = j;
    }

    @Override
    public String toString(){
        return this.a + " + " + this.b + "i";
    }

    public static void main( String[] args ) {

        Complex c1 = new Complex(2, 3); 

        // Without @Override on the "toString()" method, this will print something like:
        // "OOP.Complex@7344699f" instead of "2 + 3i"
        System.out.println(c1); 
    
    }
}