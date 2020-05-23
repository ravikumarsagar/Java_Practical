package shop;

public class BaseCustomer {
    private String id;

    public void setId(String s){
        this.id=s;
    }

    public String getId(){
        String formattedId=this.id+" Hello";
        return formattedId;
    }
}
