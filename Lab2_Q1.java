import java.util.Scanner;

class Lab2_Q1 {
    public static double PI = 3.14159;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;

        System.out.print("The area of the circle with radius " + radius + " is " + area);


        input.close();

    }
    
}
