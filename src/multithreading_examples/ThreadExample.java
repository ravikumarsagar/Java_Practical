package multithreading_examples;
import java.lang.Runnable;  //using runnable interface
public class ThreadExample  {
    public static void main(String[] args) {
        Thread thread=new Thread(new A());
        thread.start();
        Thread thread1=new Thread(new  B());
        thread1.start();
    }
}
class A implements Runnable{
    public void run(){
        for (int i=0;i<6;i++){
            System.out.println("Thread A "+i);
        }
    }
}
class B implements Runnable{

    public void run(){
        for (int i=0;i<6;i++){
            System.out.println("Thread B "+i);
        }
    }

}


class SleepException extends Thread{
    public void run(){
        for (int i=1;i<5;i++){
            try{
                Thread.sleep(200);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        SleepException e=new  SleepException();
        SleepException e1=new SleepException();
        e.start();
        e1.start();
    }
}