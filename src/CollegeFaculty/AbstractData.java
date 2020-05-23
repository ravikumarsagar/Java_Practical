package CollegeFaculty;

abstract class AbstractData
{
    String name;
    private int phone_no;
    String address;
    String department;

    public void AbstractData() {
        System.out.println(name+" "+phone_no+" "+address+" "+department);
    }
}
