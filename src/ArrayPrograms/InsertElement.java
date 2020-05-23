package ArrayPrograms;
public class InsertElement
{
    public static void main(String[] args) {
        int array[]={20,30,40,50,60};
        int position=4;
        int element=10;
        for (int i=array.length-1;i<position-1;i--)
        {
            array[i]=array[i-1];
        }
        array[position-1]=element;
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
//check again