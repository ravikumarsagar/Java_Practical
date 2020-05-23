package Programs;

public class ReverseString {
    public static void main(String[] args) {

        String name="Shweta";
        int lenght=name.length();
        String reverse="";
        for (int i=lenght-1;i>=0;i--)
        {
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }
}

