interface PrintMessages {

    
    public  void printStarting();

    public  void printModeInfo();

    public  void printModeChoosing();

    public  void printMovieSelect();

}

class printMessage implements PrintMessages {

    public void printStarting() {
        System.out.println("Welcome to Hangmania \n \n");
    }

    public void printModeInfo() {
        System.out.println("(Press 1 for singleplayer   ....   Press 2 for Multiplayer) \n \n");
    }

    public void printModeChoosing() {
        System.out.print("Select the Mode: ");
    }

    public void printMovieSelect() {
        System.out.println("");
    }

}

public class Msg {
    public static void main(String[] args) {

    }
}
