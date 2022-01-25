import java.util.Scanner;
public class Lab2_Q2{


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float average = (a + b + c)/3;
        System.out.print("The average of " + a + " " + b + " " + c + " is " +average);
        input.close();
    }
}
