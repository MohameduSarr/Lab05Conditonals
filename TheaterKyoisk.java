import java.util.Scanner;
public class TheaterKyoisk {
    public static void main(String[] args) {


        System.out.println("What is your age?");

        Scanner scanner = new Scanner(System.in);

        double userAge = scanner.nextDouble();

        if(userAge >= 21){
            System.out.println("You get a wristband!");
        }


    }
}
