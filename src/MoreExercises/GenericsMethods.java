package MoreExercises;

public class GenericsMethods { //with array Example
    public static void main(String[] args) {

        GenericsMethods g=new GenericsMethods();
        Integer number[]={4,3,2,1,1};
        g.printArray(number);
        String s[]=new String[]{"ravi","kumar","sagar"};
        g.printArray(s);
    }

    public <T> void printArray( T [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void printArray1(String[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//without Array Example
class GenericExample{
    public <T>void G1(T s){
        for (int i=0;i<3;i++){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        GenericExample g=new GenericExample();
        String s="ravi";
        g.G1(s);
        Integer i=50;
        g.G1(i);
        Double f=50.55;
        g.G1(f);

    }
}