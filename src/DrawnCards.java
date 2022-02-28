import java.util.ArrayList;

public class DrawnCards extends Pile{
    ArrayList<Card> toBePlayed;
    private int x, y; 
    //x value: 120
    //y value: 80


    public DrawnCards(int x, int y) {
        this.x = x;
        this.y = y;
        toBePlayed = new ArrayList<Card>();
    }


    public void takeCard(Deck d) {
        toBePlayed.add(d.deal());
    }

    public void removeCard() {
        toBePlayed.remove(0);
    }


}
