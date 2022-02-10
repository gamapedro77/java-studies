package javaBasics;

public class Variables {
    public static void main(String[] args) {

        // integers declaration and assignment
        int x = 4;
        System.out.println(x);

        // string declaration and assignment
        String hello = "Hello World!";
        System.out.println(hello);

        // arrays declaration and assignment
        int [] values = new int[100];
        values[0] = 27;
        System.out.println(values[0]);

        // using methods
        int result = Methods.sumTwoNumbers(25, 50);
        System.out.println(result);
    }
}
