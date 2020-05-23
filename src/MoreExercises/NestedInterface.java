package MoreExercises;

public class NestedInterface implements Start.Start1 {

    public void Bike(){
        System.out.println("Start1 Interface");
    }
    public static void main(String[] args) {
        Start.Start1 n=new NestedInterface(); //upcasting here
        n.Bike();
    }
}

interface Start
{
    //void Car();

    interface Start1
    {
        void Bike();
    }
}


class Nested{
    interface I1{
        void Start();
    }
}
class NestedRunner implements Nested.I1
{

    public void Start()
    {
        System.out.println("Interface I1 Start");
    }
    public static void main(String[] args)
    {
        Nested.I1 n=new NestedRunner();
        n.Start();
    }
}
