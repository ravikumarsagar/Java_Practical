package MoreExercises;

public class Wrapper {
    public static void main(String[] args)
    {
        int i=40;
        Integer integer = Integer.valueOf(i); //int to Integer
        System.out.println(integer);
        System.out.println(integer.getClass());
    }
}
