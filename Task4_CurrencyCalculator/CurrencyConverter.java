//******CURRENCY CONVERTER*******
import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****** Currency Converter *******");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");

        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        System.out.println("Enter the amount:");
        double amt = sc.nextDouble();

        double result;

        switch (choice) {
            case 1:
                result = amt * 0.011;
                System.out.printf("The amount is ₹%.3f = $%.3f", amt, result);
                break;
            case 2:
                result = amt * 94.73;
                System.out.printf("The amount is $%.3f = ₹%.3f", amt, result);
                break;
            default:
                System.out.println("Invalid Choice! Thanks for comming");
                break;
        }

    }
}
