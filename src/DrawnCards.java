import java.util.ArrayList;

public abstract class DrawnCards extends Deck{
    private Pile drawnPile;

    public void drawFromDeck() {
        for (int i = 0; i < 3; i++) {
            this.drawnPile.add(deck.deal());
        }
    }
}
