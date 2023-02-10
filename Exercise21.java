import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First number");
        int FristNum = input.nextInt();
        System.out.println("Second number");
        int SecondNum = input.nextInt();
        System.out.println("Input first number: " + FristNum);
        System.out.println("Input second number: " + SecondNum);
        int plus = FristNum + SecondNum;
        int minus = FristNum - SecondNum;
        int Kune = FristNum * SecondNum;
        int harn = FristNum / SecondNum;
        int mod = FristNum % SecondNum;
        System.out.println(FristNum + " + " + SecondNum + " = " + plus);
        System.out.println(FristNum + " - " + SecondNum + " = " + minus);
        System.out.println(FristNum + " x " + SecondNum + " = " + Kune);
        System.out.println(FristNum + " / " + SecondNum + " = " + harn);
        System.out.println(FristNum + " mod " + SecondNum + " = " + mod);
    }

}