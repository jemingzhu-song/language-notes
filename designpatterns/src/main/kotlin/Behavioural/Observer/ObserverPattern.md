The Observer Pattern involves a Publisher/Subject class, which maintains a list of Subscribers/Observers - each with
their own `update` function (since Observer is an interface, and the list is a list of ConcreteObservers to be
specific). 

This list of ConcreteObservers can be **fixed** (either `@Autowired` or predefined), or **dynamic** (by defining
functions in the Subject that allow it to **attach** or **detach** observers)

When an event or change occurs, the Subject class loops through its list of ConcreteObservers and calls each of its
`update` functions to **notify the observers**.

Using the Observer pattern makes it easy to create new "Observers" as you only have to create a new class that
implements the Observer interface, and that's it!