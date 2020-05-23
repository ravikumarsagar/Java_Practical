package searching_technique;

public class LinearSearch {
    public static void main(String[] args) {
        /*int arr[]={5,6,7,8,9,2,10};
        int number=5; // for integer value
        int temp=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==number){
                System.out.println("Number present at "+i+" position");
                temp=temp+1;
            }
        }
        if (temp==0){
            System.out.println("number not present in array");
       // }*/
        String str[]={"sagar","kumar","ravi","sonu","monu"};
        String name ="ravi";
        int temp=0;
        for (int i=0;i<str.length;i++){
            if (str[i].equals(name)){
           System.out.println("Name is present at "+i+ " position");
           temp=temp+1;
            }
        }
        if (temp==0){
            System.out.println("not available");
        }
    }
}
