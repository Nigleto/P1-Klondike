import java.awt.Graphics;
import java.awt.event.ActionEvent;

/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable {
    private int suite;
    private int value;

    public Card(int suite, int value) {
        this.suite = suite;
        this.value = value;
    }

    public int getSuit() {
        return this.suite;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public void update(ActionEvent a) {
        
        
    }

    @Override
    public void draw(Graphics g) {
        
    }

    public int compareTo(Card c){
		return this.getValue() - c.getValue();
	}
	

}
