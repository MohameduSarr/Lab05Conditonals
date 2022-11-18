import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {

        System.out.println("What is your item price?");

        Scanner scanner = new Scanner(System.in);

        double itemPrice = scanner.nextDouble();


        double shippingCost = 0;

        if (itemPrice <= 100) {
            shippingCost = itemPrice * 0.02;
        } else {
            shippingCost = 0;
        }

        double totalCost = shippingCost + itemPrice;

        System.out.println("Your shipping cost is " + shippingCost + " and your total cost is " + totalCost);


    }
}
