package shop;
public class Runner {
    public static void main(String[] args)
    {
        int x=0;
        int y=0;
        int sum=0;
        Customer customer=new Customer();
        customer.setId("madan");
        String customerId=customer.getId();
        System.out.println(customerId);
        customer.setId("mohan");
        String name=customer.getId();
        System.out.println(name);

        customer.setDetails("Madan",987125314,"Delhi");
        customer.printDetails();
        System.out.println(customer.mobile());
        System.out.println(customer.address());
        System.out.println(customer.name());

        customer.setName("Ravi");
        String updated=customer.name();
        System.out.println(updated);

        customer.printDetails();
        customer.setPhone_no(963852741);
        customer.printDetails();
        x=10;
        y=20;
        sum=customer.add(y,x);
        System.out.println(sum);

    }
}
