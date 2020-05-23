package shop;

public class Customer extends BaseCustomer{
    private String name;
    private int phone_no;
    private String address;

    public void setDetails(String s,int p,String a){
        this.name=s;
        this.phone_no=p;
        this.address=a;
    }
    public void printDetails(){
        System.out.println(name+" "+phone_no+" "+address);
    }
    public int mobile(){
        return this.phone_no;
    }
    public String address(){
        return this.address;
    }
    public String name(){
        return this.name;
    }
    public void setName(String setname){
        this.name=setname;
    }
    public void setPhone_no(int number){
        this.phone_no=number;
    }

    public int getPhone_no(){
        return this.phone_no;
    }

    public int add(int a,int b){
        int c=0;
        c=a*b;
        return c;
    }
}
