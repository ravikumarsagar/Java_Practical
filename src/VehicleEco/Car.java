package VehicleEco;
abstract class Car
{
    int tyre;
    int window;
    String color;
    int model;
}
class ListOfCars extends Car{
    String name;
     ListOfCars(String name,int tyre,String color,int model,int window){
        this.name=name;
        this.tyre=tyre;
        this.window=window;
        this.color=color;
        this.model=model;
    }
    public void printDetail()
    {
        System.out.println(this.name+" "+this.model+" "+this.color+" "+this.window+ " "+this.tyre);
    }

    public static void main(String[] args) {
        Car car=new ListOfCars("BMW",4,"Red",2017,6);
        Car car1=new ListOfCars("Audi",4,"Grey",2019,2);
        Car car2=new ListOfCars("Suzuki",4,"Green",2018,8);
        Car car3=new ListOfCars("Maruti",4,"Blue",2010,8);
        Car car4=new ListOfCars("Celerio",4,"Black",2011,4);
        ((ListOfCars) car).printDetail();
        ((ListOfCars) car1).printDetail();
        ((ListOfCars) car2).printDetail();
        ((ListOfCars) car3).printDetail();
        ((ListOfCars) car4).printDetail();
    }
}


