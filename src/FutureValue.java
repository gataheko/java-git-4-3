import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter monthly investment: ");
            double monthlyInvestment = Double.parseDouble(sc.nextLine());
            
            System.out.print("Enter yearly interest rate: ");
            double yearlyInterestRate = Double.parseDouble(sc.nextLine());
            
            System.out.print("Enter number of years: ");
            int years = Integer.parseInt(sc.nextLine());
            
            int months = years * 12;
            double monthlyInterestRate = yearlyInterestRate / 12 / 100;
            double futureValue = 0.0;
            
            for (int i = 1; i <= months; i++) {
                futureValue = (futureValue + monthlyInvestment) 
                            * (1 + monthlyInterestRate);
                
                System.out.println("Month " + i + ": " + futureValue);
            }
            
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            System.out.println("Future value: " + currency.format(futureValue));
            
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Bye!");
        sc.close();
    }
}