package Practice;
public class StringMethods {
    public static void main(String[] args)
    {
        //string compare
        String s="ravi";  // equal method return true or false
        String s1="ravi";
        String s2="kumar";
        String s3="Ravi";
        System.out.println(s.equals(s3));
        System.out.println(s.equalsIgnoreCase(s3));
        System.out.println(s.equals(s2));

        System.out.println("== operator compares references not values");

        String s4="ravi";  //return true false
        String s5="ravi";
        String s6="kumar";
        String s7="Ravi";
        System.out.println(s4==s5);
        System.out.println(s4==s7);
        System.out.println(s4==s6);

        System.out.println("compareTo method return integer value");

        String s8="ravi";
        String s9="ravi";
        String s10="sagar";
        String s11="om";

        System.out.println(s8.compareTo(s9)); //0 because s8==s9
        System.out.println(s8.compareTo(s10)); //-1 because s8(4)<s10(5)
        System.out.println(s9.compareTo(s10));

    }
}
class StringMethod{
    public static void main(String[] args) {
        String s="ravi.com";
        //System.out.println(s.substring(0,8));
        //System.out.println(s.substring(3));
        System.out.println(s.trim());
        System.out.println(s.charAt(6));

        int a=10;
        String s1=String.valueOf(a); // convert String like int char float double etc
        System.out.println(s1+10);

        System.out.println(s.replace("r","p"));
    }
}

class StringBufferExample{
    public static void main(String[] args) {

        StringBuffer s=new StringBuffer("ravi");
        //String s1="ravi";
       // s.append("kumar");
        //System.out.println(s);
        //s.insert(2,"kumar");
        //System.out.println(s);
        //s.replace(1,2,"f");
        //System.out.println(s);
        System.out.println(s.reverse());

    }
}
