package shop;
public class BaseOrder {
    private String id;
    private int order_no;
    private String name;

    public void setId(String id){
        this.id=id;
    }
    public void setOrder_no(int o){
        this.order_no=o;
    }

    public void setName(String n){
        this.name=n;
    }

    public String getId(){
        return this.id;
    }

    public int getOrder_no() {
        return this.order_no;
    }

    public String getName(){
        return this.name;
    }
    public void printInfo(){
        System.out.println(this.id+this.order_no+this.name);
    }
}
