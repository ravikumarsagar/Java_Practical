package multithreading_examples;
public class ThreadExample1 {
    public static void main(String[] args) {
        Car car=new Car();
        car.start();
        Bike bike=new Bike();
        bike.start();
    }
}
class Car extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Car Start "+i);
        }
    }
}
class Bike extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Bike Start "+ i);
        }
    }
}
