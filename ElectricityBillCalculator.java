import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total units consumed: ");
        int units = scanner.nextInt();
        scanner.close();
        double bill = 0;
        if(units<=100){
            bill=units*1.5;
        }
        else if(units>=101 && units<=300){
            bill=units*2.5;
        }
        else if(units >=301 && units<=500){
            bill=units*4;
        }
        else{
            bill=units*6;
        }
        System.out.println("Electricity Bill: ₹" + bill);
    }
}
