import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {

        int birthMonth = 0;
        boolean done = false;
        String trash = "";
        do
        {

            // Code and control logic to loop until validated
            Scanner in = new Scanner(System.in);
            System.out.print("What is your birth month [1 - 12]: ");
            if(in.hasNextInt())
            {
                birthMonth = in.nextInt();
                in.nextLine(); // clear input buffer
                System.out.println("You birth month is: " + in.nextInt());
                if(birthMonth >= 1 && birthMonth <= 12)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value in range [1 - 12]: " + birthMonth);
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must entedr an int [1 - 12]: " + trash);
            }

        }while(!done);
       }
    }
