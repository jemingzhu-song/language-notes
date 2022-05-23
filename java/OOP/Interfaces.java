package OOP;
/*
    Notes
    1.  An Interface is a fully abstract class - it includes a group of abstract methods.
    2.  Interfaces are indicated using the "interface" keyword, e.g.:

        interface Language {
            public String getType();

            public String getVersion();
        }
    3.  Similar to Abstract Classes, you cannot create objects of interfaces. To use an Interface,
        other classes must IMPLEMENT the interface. This is indicated using the "implements" keyword:
        
        class English implements Language {
            @Override
            public String getType() {
                return "English Language";
            }

            @Override
            public String getVersion() {
                return "English v.2022";
            }
        }

    4.  Unlike Abstract Classes, Interfaces CANNOT HAVE A CONSTRUCTOR.
    5.  A class can implement MULTIPLE INTERFACES.

        class English implements Language, Dialect {
            ...
        }
    6.  Interfaces can EXTEND multiple other Interfaces using the "extends" keyword:
        
        interface Polygon extends Line {
            ...
        }

        or

        interface Polygon extends Line, Dot {
            ...
        }
    7.  All fields/values in an interface must be "public static final" (i.e. constants)
*/


public class Interfaces {
    
}

/* -------------------- Implementing an Interface -------------------- */
interface Polygon {
    public void getArea();
}

class Rectangle implements Polygon {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Implementing the Abstract Method from the Interface "Polygon"
    @Override
    public void getArea() {
        System.out.println("The area of the RECTANGLE is: " + (this.length * this.breadth));
    }
}

/* -------------------- Implementing MULTIPLE Interfaces -------------------- */
interface A {
    public void getA();
}

interface B {
    public void getB();
}

class C implements A, B {
    @Override
    public void getB() {
        System.out.println("C implementation of B");
    }

    @Override
    public void getA() {
        System.out.println("C implementation of A");
    }
}

/* -------------------- Extending Interfaces -------------------- */
interface Line {
    // members of Line interface
}

interface Dot {
    // members of Dot interface
}
  
// extending interface
interface Shape extends Line {
    // members of Shape interface
    // members of Line interface
}

// extending MULTIPLE interfaces
interface ShapeAgain extends Line, Dot {
    // members of Shape interface
    // members of Line interface
    // members of Dot interface
}