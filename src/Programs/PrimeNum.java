package Programs;
public class PrimeNum {
    public static void main(String[] args) {
        int number=15;
        int temp=0;
        for (int i=2;i<=number-1;i++){
            if(number%i==0){
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println(number+" is prime number");
        }
        else {
            System.out.println(number+" is not prime number");
        }
    }
}


//1,2,3,5,7,11,13,17
