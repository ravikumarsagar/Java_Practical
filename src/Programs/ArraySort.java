package Programs;

public class ArraySort {
    public static void main(String[] args)
    {
        int a[]={2,5,9,3,7,1,6};
        int temp=0;
        for (int i=a.length;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
