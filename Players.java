class Player{
    int Heart=5;
    int Score;
}

class Singleplayer extends Player{

}

class Multiplayer extends Player{
    public int calculateScore(int Heart){
        return Heart*10;
    }
}

public class Players{
    public static void main(String[] args) {
        
    }
}