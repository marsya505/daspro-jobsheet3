import java.util.Scanner;

public class electricity11 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        boolean exceedsLimit ;
        double electricityUsage, electricityTariff = 1500.0, totalBill;

        System.out.print("exceeds 500 kWh (true/false): "); 
        exceedsLimit = input.nextBoolean();
        System.out.print("Enter the electricity usage in kWh: ");    
        electricityUsage = input.nextDouble();
        totalBill = electricityUsage * electricityTariff;
        System.out.println("Total electricity tariff: Rp" + totalBill);

    }
}
