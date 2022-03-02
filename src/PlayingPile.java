import java.awt.Graphics;
import java.util.ArrayList;

public class PlayingPile extends Pile{
    private int x;
    private int y;

    public PlayingPile(int x, int y) {
        this.x = x;
        this.y = y;
        this.cards = new ArrayList<Card>();
    }

    public void addSmallPile(Pile p) { //adds the "smaller" Pile p to the current bigger pile
        Card current = this.cards.get(0);
        Card end = p.getPile().get(-1);
        if (current.isBlack() != end.isBlack() && current.getValue()-1 == end.getValue()) {
            this.addPile(p);
        }
    }

    public void draw(Graphics g) {
        for (int i = 0; i < this.cards.size(); i++) {
            g.drawImage(this.cards.get(i).getImage(), this.x + (i*80), this.y, null);
        }
    }
}
