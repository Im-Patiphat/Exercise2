import java.util.Scanner;
public class Exercise27{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Product name : ");
        String proname = input.nextLine();
        System.out.print("Enter Product price : ");
        int price = input.nextInt();
        System.out.print("Enter Product amount : ");
        int amount = input.nextInt();
        int pay = price*amount;
        System.out.println("You buy :"+proname +" price : "+ price+" amount : "+ amount );
        double vat = pay+(pay*(7.0/100.0));
        System.out.print("you have pay : "+vat);
        
    }
}