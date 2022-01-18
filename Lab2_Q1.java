import java.util.Scanner;

class Lab2_Q1 {
    public static double PI = 3.14159;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = input.nextShort();

        System.out.print("Enter an int value: ");
        int intValue = input.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = input.nextLong();

        System.out.print("Enter a Double value: ");
        float floatValue = input.nextFloat();

        System.out.println(byteValue+"\n"+shortValue+"\n"+intValue+"\n"+longValue+"\n"+floatValue);

        System.out.println("Area of Circle Calculation");

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;

        System.out.printf("The area of the circle with radius %f is: %f",radius,area);

    }
    
}
