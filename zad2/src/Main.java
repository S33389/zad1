import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        double num = sc.nextDouble();

        if(num>0) {
            System.out.println("the number is positive");
        }
        else if(num<0) {
            System.out.println("the number is negative");

        }
        else {
            System.out.println("the number is zero");
        }
    }
}