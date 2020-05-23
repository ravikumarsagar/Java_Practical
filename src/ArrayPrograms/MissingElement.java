package ArrayPrograms;
public class MissingElement
{
    public static void main(String[] args) {
        int array[]={1,2,3,5,6};
        int expected=array.length;
        int sum=expected*(expected+1)/2;
        System.out.println(sum);
        int add=0;
        for (int i=0;i<=5;i++){
            add=add+array[i];
            System.out.println("Missing Element is"+(sum-add));
        }
    }
}

//Again Check Code
