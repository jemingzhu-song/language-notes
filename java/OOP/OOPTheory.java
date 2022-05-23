package OOP;

public class OOPTheory {
}

/* ------------------------------ Polymorphism ------------------------------ */
/*

Polymorphism is an important concept of object-oriented programming. 
It simply means more than one form.

That is, the same entity (method or operator or object) can perform different 
operations in different scenarios.

In the below example, we have created a superclass: 
Polygon and two subclasses: Square and Circle. Notice the use of the render() method.

The main purpose of the render() method is to render the shape. 
However, the process of rendering a square is different than the process of rendering a circle.

Hence, the render() method behaves differently in different classes. Or, 
we can say render() is polymorphic.

Why Polymorphism?
Polymorphism allows us to create consistent code. In the previous example, 
we can also create different methods: renderSquare() and renderCircle() to render Square 
and Circle, respectively.

This will work perfectly. However, for every shape, we need to create different methods. 
It will make our code inconsistent.

To solve this, polymorphism in Java allows us to create a single method render() that will 
behave differently for different shapes.

We can achieve polymorphism in Java using the following ways:

    1. Method Overriding
    2. Method Overloading
    3. Operator Overloading

*/

class PolygonAgain {
    // method to render a shape
    public void render() {
        System.out.println("Rendering Polygon...");
    }
}
  
class SquareAgain extends PolygonAgain {
    // renders Square
    public void render() {
        System.out.println("Rendering Square...");
    }
}
  
class CircleAgain extends PolygonAgain {
    // renders circle
    public void render() {
        System.out.println("Rendering Circle...");
    }
}
  
class CheckShapes {
    public static void main(String[] args) {
        // create an object of Square
        SquareAgain s1 = new SquareAgain();
        s1.render();
        // create an object of Circle
        CircleAgain c1 = new CircleAgain();
        c1.render();
    }
}

/* ------------------------------ Encapsulation ------------------------------ */
/*

Encapsulation is one of the key features of object-oriented programming. 
Encapsulation refers to the bundling of fields and methods inside a single class.

It prevents outer classes from accessing and changing fields and methods of a class. 
This also helps to achieve data hiding.

In the below example, we have created a class named Area. 
The main purpose of this class is to calculate the area.

To calculate an area, we need two variables: length and breadth and a method: getArea(). 
Hence, we bundled these fields and methods inside a single class.

Here, the fields and methods can be accessed from other classes as well. 
Hence, this is not data hiding.

This is only encapsulation. We are just keeping similar codes together.
*/

class AreaEncapsulation {
    // fields to calculate area
    int length;
    int breadth;
  
    // constructor to initialize values
    AreaEncapsulation(int length, int breadth) {
      this.length = length;
      this.breadth = breadth;
    }
  
    // method to calculate area
    public void getArea() {
      int area = length * breadth;
      System.out.println("Area: " + area);
    }
}
  
class MainEncapsulation {
    public static void main(String[] args) {
      // create object of Area
      // pass value of length and breadth
      AreaEncapsulation rectangle = new AreaEncapsulation(5, 6);
      rectangle.getArea();
    }
}

/*
Why Encapsulation?

In Java, encapsulation helps us to keep related fields and methods together, 
which makes our code cleaner and easy to read.
It helps to control the values of our data fields. For example,

*/

class PersonEncapsulation {
    private int age;
  
    public void setAge(int age) {
      if (age >= 0) {
        this.age = age;
      }
    }
}

/*
Here, we are making the age variable private and applying logic inside the setAge() method. 
Now, age cannot be negative.

The getter and setter methods provide read-only or write-only access to our class fields. For example:
    getName()  // provides read-only access
    setName() // provides write-only access

It helps to decouple components of a system. For example, we can encapsulate code into multiple 
bundles.

These decoupled components (bundle) can be developed, tested, and debugged independently and 
concurrently. And, any changes in a particular component do not have any effect on other components.

We can also achieve data hiding using encapsulation. In the above example, if we change the length 
and breadth variable into private, then the access to these fields is restricted.

And, they are kept hidden from outer classes. This is called data hiding.
*/