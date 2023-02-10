import java.util.Scanner;
public class Exercise25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height (cm.)");
        double height = input.nextDouble();
        System.out.print("Enter your weight (kg.)");
        double weight = input.nextDouble();
        double heightM = height / 100 ;
        double BMI = weight / (heightM*heightM);
        System.out.println("Your BMI = "+ BMI );

        String status = " ";
        if (BMI >= 30) status = "อ้วนมาก";
        else if (BMI >= 25) status = "อ้วน";
        else if (BMI >= 23) status = "สูงกว่าเกณฑ์";
        else if (BMI >= 18) status = "สมส่วน";
        else  status = "ผอม";
         
        System.out.println("คุณอยู่ในเกณฑ์: "+status);



    }
}