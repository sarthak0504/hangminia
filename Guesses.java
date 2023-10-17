import java.util.Scanner;

class Guess {
    Scanner sc = new Scanner(System.in);
    Multiplayer m2 = new Multiplayer();
    public void Check(String Movie, int Heart, StringBuilder BlankMovie) {

        while (Heart != 0) {
            System.out.print("Enter a Letter: ");
            String Ans = sc.next();

            int flag = 0;

            for (int i = 0; i < Movie.length(); i++) {
                if (Ans.charAt(0) == Movie.charAt(i)) {
                    BlankMovie.setCharAt(i, Ans.charAt(0));
                    flag = 1;

                }
            }
            if (flag == 1) {

                System.out.println(BlankMovie + "                       " + Heart + " Hearts left \n"); // 6 Tabs space
                if (Movie==BlankMovie.toString()) {
                    System.out.println(m2.calculateScore(Heart));
                    break;
                }
            }

            else {
                Heart--;
                System.out.println("WRONG!                      " + Heart + " Hearts left \n");
            }

        }

    }

}

class Blanks extends Guess {

    public void setBlank(String Movie, StringBuilder BlankMovie) {
        for (int i = 0; i < Movie.length(); i++) {
            if (Movie.charAt(i) == ' ') {
                BlankMovie.setCharAt(i, ' ');
            } else
                BlankMovie.setCharAt(i, '-');

        }
    }

}

public class Guesses {
    public static void main(String[] args) {

    }
}
