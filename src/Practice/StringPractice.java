package Practice;
import java.lang.String;

public class StringPractice {
    public static void main(String[] args)
    {
     String s="Ravi";
     s=s.concat("kumar");
     System.out.println(s);
     String string="ravi kumar sagar";//string literal
        System.out.println(string.substring(8));
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string.trim()); //
        System.out.println(string.valueOf(string+10));
        System.out.println(string.indexOf("k"));
        System.out.println(string.startsWith("PORT",9));
        System.out.println(string.startsWith("r"));
        String str=new String("PORT : 8080");
        System.out.println(str);
        char ch[] ={'T','R','U','E'};
        String str1=new String(ch);
        System.out.println(str1);
        String ss=new String("Ravi");
        s=ss.concat("kumar");
        System.out.println(ss);
        String s1=40+10+50+"ravi"+10+20;
        System.out.println(s1);
        String s2=" ravi kumar sagar";
        int s4=s2.lastIndexOf("m",5);
        int s5=s2.indexOf(" ");
        System.out.println(s4);
        //String s4=s2.concat(s3);
        System.out.println(s4);
        System.out.println(s2.substring(0,5));
        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.trim());
        System.out.println(s2.charAt(5));
        System.out.println(s2.length());
        System.out.println(s2.replace("ravi","sonu"));

}
}

