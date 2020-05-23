package Practice;
class StringPractices {
    int roll_no;
    String name;
    String address;

    StringPractices(int roll_no,String name,String address){
        this.roll_no=roll_no;
        this.name=name;
        this.address=address;
    }
    @Override
    public String toString() {
        return roll_no+" "+name+" "+address;
    }
    public static void main(String[] args) {
        StringPractices str=new StringPractices(100,"ravi","Delhi");
        System.out.println(str);

    }
}

