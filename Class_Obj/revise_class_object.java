package Class_Obj;
// import java.util.*;

interface vehicle{
    void start();
}

class Car implements vehicle{
    public void start()
    {
        System.out.println("Car started");
    }
}

class Bike implements vehicle{
    public void start()
    {
        System.out.println("Bike started");
    }
}

class revise_class_object{
    public static void main(String args[])
  {
    Car c=new Car();
    c.start();
    Bike b=new Bike();
    b.start();
  }
}