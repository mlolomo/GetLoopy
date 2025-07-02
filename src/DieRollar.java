import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean keepGoing = true;

        while (keepGoing) {
            int rollCount = 0;
            int die1;
            int die2;
            int die3;

            System.out.printf("Roll\tDie1\tDie2\tDie3\tSum\n");
            System.out.println("----------------------------------------");

            do {
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                rollCount++;
                System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\n", rollCount, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3));

            System.out.print("Tripled! Do you want to roll again? (y/n): ");
            String response = input.next();
            if (!response.equalsIgnoreCase("y")) {
                keepGoing = false;
            }
        }
    }
}
