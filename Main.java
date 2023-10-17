import java.util.Scanner;
import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        printMessage msg = new printMessage();
        Info inf = new Info();
        Blanks bl = new Blanks();

        int Mode;
        int Turn;
        int MaxTurn = 2;

        msg.printStarting(); // To print Welcome
        msg.printModeInfo(); // To print info about modes

        do {

            msg.printModeChoosing();
            Mode = sc.nextInt();

        } while (Mode != 1 && Mode != 2);

        if (Mode == 1) { // For Singleplayer

            Singleplayer s1 = new Singleplayer();

            for (Turn = 1; Turn <= MaxTurn; Turn++) {

            }

        }

        else if (Mode == 2) { // For Multiplayer

            Multiplayer m1 = new Multiplayer();

            inf.printInst(1);
            inf.Player1 = sc.next();
            inf.printInst(2);
            inf.Player2 = sc.next();
            System.out.print("\n");

            for (Turn = 1; Turn <= MaxTurn; Turn++) {

                if (Turn % 2 == 1)
                    System.out.println(inf.Player1 + ": ");
                else
                    System.out.println(inf.Player2 + ": ");

                char[] movieName = console.readPassword("Enter the Movie: "); // For Entering Movie Name
                String Movie = new String(movieName);
                StringBuilder BlankMovie = new StringBuilder(Movie);

                System.out.print("\n");

                bl.setBlank(Movie, BlankMovie);

                System.out.println(BlankMovie);

                System.out.println("\n");

                if (Turn % 2 == 1)
                    System.out.println(inf.Player2 + ": ");
                else
                    System.out.println(inf.Player1 + ": ");

                bl.Check(Movie, 5, BlankMovie);

            }

        }

        sc.close();
    } // PSVM ends
} // MAIN ends