import java.util.Scanner;

public class salary11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hoursofWorked;
        Double hourlyWages = 10000.0, bonus = 0.10, tax = 0.05, totalBonus, beforeTax, monthlySalary, totaltax;

        System.out.print("Hours of worked in one month: "); 
        hoursofWorked = sc.nextInt();
        beforeTax = hoursofWorked * hourlyWages;
        totalBonus = beforeTax * bonus;
        totaltax = (beforeTax + totalBonus) * tax;
        monthlySalary = beforeTax + totalBonus - totaltax;
        System.out.println("Total monthly salary Rp" + monthlySalary);
    }

}
