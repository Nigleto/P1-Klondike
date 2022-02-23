import java.util.ArrayList;

public class DrawnCards extends Pile{
    ArrayList<Card> toBePlayed;
    private int x, y; 
    //x values: 120, 195, 270, 345
    //y value: 80


    public DrawnCards(int x, int y) {
        this.x = x;
        this.y = y;
        toBePlayed = new ArrayList();
    }


    public void takeCard() {
        toBePlayed.add(deck.deal());
    }

    public void removeCard() {
        toBePlayed.remove(0);
    }


}
