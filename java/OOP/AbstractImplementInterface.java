package OOP;

import java.time.LocalDateTime;

public class AbstractImplementInterface {
    
}

interface Vehicle {
    public void fly(int x, int y, int z);
    public void timeTravel(LocalDateTime dateTime);
}

abstract class Plane implements Vehicle {
    private int passengerCount;
    private int crewCount;

    public void takeOff() {
        System.out.println("Plane takeoff!");
    };
}

class A380 extends Plane {
    @Override
    public void fly(int x, int y, int z) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void timeTravel(LocalDateTime dateTime) {
        // TODO Auto-generated method stub
        
    }
}