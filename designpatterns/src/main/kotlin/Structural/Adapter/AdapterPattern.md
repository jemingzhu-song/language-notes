The adapter pattern converts the interface of a class into another interface the client expect. 
Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.

This pattern allows us to use a client with an incompatible interface by creating an adapter that does the conversion. 
This acts to decouple the client from the implemented interface, and if we expect the interface to change over time, the 
adapter encapsulates that change over time, the adapter encapsulates that change so that the client doesn’t have to be 
modified each time it needs to operate against a different interface.

The adapter acts as the middleman by receiving requests from the client and converting them into 
requests that make sense on the vendor classes.

There are two types/variations of the Adapter Pattern:
* Class Adapter - uses multiple inheritance to adapt one interface to another
  * The "Adapter" class implements/inherits from both the Target class/interface and the Adaptee class/interface
* Object Adapter - relies on object composition, the Adapter class acts as a "wrapper" class
  * The "Adapter" class implements/inherits from the Target class/interface, and maintains an instance of the Adaptee class

<h3>When to Choose What?</h3>
Choose Class Adapter When:
* We need to adopt a single class or a small number of classes. 
* We want to override or customize behaviors inherited from the adaptee.

Choose Object Adapter When:
* We need to adapt multiple classes with different interfaces. 
* Adaptation of subclasses is a common requirement.

In summary, the choice between the Class Adapter Pattern and the Object Adapter Pattern depends on the specific 
requirements of our software project. Each pattern has its strengths and weaknesses, and the decision should align 
with our design goals and constraints.