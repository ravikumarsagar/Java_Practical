package searching_technique;

//package Practice;
public class BinarySearch{
    public static void main(String[] args) {

        int array[]={1,5,6,8,9,10,15};
        int search=5;
        int lower=0;
        int higher=array.length-1;
        int middle=(lower+higher/2);

        while(lower<=middle){
            if (array[middle]==search) {
                System.out.println("item available at"+middle+"position");
                break;
            }
            else if (array[middle]<search) {
                lower=middle+1;
            }
            else{
                higher=middle-1;
            }
            middle=(lower+higher/2);
        }
        if (lower>higher) {
            System.out.println("item not found");
        }
    }
}