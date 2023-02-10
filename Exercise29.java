import java.util.Scanner;
public class Exercise29{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter money(Bath) : ");
        int bath = input.nextInt();
        double dollar = 35.0;
        double money =  bath / dollar;
        System.out.print("คุณมีเงิน "+money+ " dollar");
        
 
 
    }
}