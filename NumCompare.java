import java.util.Scanner;
public class NumCompare {
    public static void main(String[] args) {

        System.out.println("Enter your first number.");

        Scanner scanner = new Scanner(System.in);

        int numOne = scanner.nextInt();

        System.out.println("Enter your second number.");

        int numTwo = scanner.nextInt();

        if (numOne == numTwo) {
            System.out.println(numOne + " is equal to " + numTwo + ".");
        } else if (numOne > numTwo) {
            System.out.println(numOne + " is greater than " + numTwo + ".");
        } else if (numTwo > numOne) {
            System.out.println(numTwo + " is greater than " + numOne + ".");
        }
    }
}
