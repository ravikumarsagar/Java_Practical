package Programs;
public class Palindrome {
    public static void main(String[] args) {
        int number=122;
        int temp=number;
        int rev=0,rem;

        while (temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if (number==rev){
            System.out.println(number+ " is palindrome");
        }
        else {
            System.out.println(number+ " not palindrome");
        }
        }
    }
