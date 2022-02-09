import java.awt.Graphics;
import java.awt.event.ActionEvent;

/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable {
    private int suite;
    private int value;
    private boolean isShowing;

    public Card(int suite, int value) {
        this.suite = suite; //0 for spades, 1 for hearts, 2 for diamonds, 3 for clubs
        this.value = value; //
        this.isShowing = false;
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
        // if (this.suite == 0) {
        //     g.drawImage("images/cards/" + "s" + this.value + ".png");
        // }
    }

    public int compareTo(Card c){
		return this.getValue() - c.getValue();
	}
	

}
