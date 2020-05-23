package shop;

public class ShipmentOrder extends BaseOrder{
    private int order_set;
    private String address;

    public void setOrder_set(int order_set){
        this.order_set=order_set;
    }
    public void setAddress(String o){
        this.address=o;

    }
    public int getOrder_set(){
    return this.order_set;
    }
    public String getAddress(){
        return this.address;
    }
    public static void main(String[] args) {
        BaseOrder base=new BaseOrder();
        base.setId("Shipping");
        System.out.println(base.getId());
        base.setName("Ram");
        base.setOrder_no(102);
        System.out.println(base.getName()+" "+base.getOrder_no());
        base.setName("Ravi");
        String s=base.getName();
        System.out.println(s);


        /*ShipmentOrder shipmentOrder=new ShipmentOrder();
        shipmentOrder.setOrder_set(101);
        shipmentOrder.setAddress("Delhi");
        System.out.println(shipmentOrder.getAddress()+" "+shipmentOrder.getOrder_set());*/
    }
}
