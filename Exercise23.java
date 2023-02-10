import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("first number");
        int first = input.nextInt();
        System.out.println("second number");
        int second = input.nextInt();
        System.out.println("third number");
        int third = input.nextInt();
        System.out.println("fourth number");
        int fourth = input.nextInt();
        System.out.println("fifth number");
        int fifth = input.nextInt();
        int average = (first + second + third + fourth + fifth) / 5;
        System.out.println(
                " Average of " + first + "," + second + "," + third + "," + fourth + "," + fifth + " is " + average);
    }

}