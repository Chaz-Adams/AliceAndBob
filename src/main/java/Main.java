import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        Main mainObject = new Main();

        // call the compute() method on that new object
        mainObject.compute();
    }

    public void compute() {
        // Get input string of name from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        // Create conditional to check name against Alice and Bob
        if(name.equals("Alice")||name.equals("Bob")){
            // Print greeting to screen if Alice or Bob are true
            System.out.println("Hello "+name+".");
        }else {
            System.out.println("You are neither Alice nor Bob.");
        }// Print "You are neither Alice nor Bob." otherwise


    }
}
