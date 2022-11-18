import java.util.Scanner;

public class PartyAffilation {
    public static void main(String[] args) {


        boolean done = false;
        String trash = "";

        // Code and control logic to loop until validated
        System.out.print("What is your party affiliation?");
        Scanner in = new Scanner(System.in);
        String D = in.nextLine();
        String R = in.nextLine();
        String I = in.nextLine();

        if (in.hasNext("D")){
           System.out.println("You get a democratic donkey!");
           done = true;
       } else if (in.hasNext("R")) {
            System.out.println("You get a republican elephant!");
            done = true;
        } else if (in.hasNext("I")) {
            System.out.println("You get an independent man!");
            done = true;
        } else {
           System.out.println("Your party affiliation is other");
           done = true;
       }

    }
}
