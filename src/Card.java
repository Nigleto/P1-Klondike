import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.io.File;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.IOException;


/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable {
    private int suite;
    private int value;
    private boolean isShowing;
    private boolean isBlack;
    private Image cardFront;
    private Image cardBack;
    private int x, y; //x and y coordinatese of where the card is on the board

    public Card(int suite, int value) {
        this.suite = suite; //0 for spades, 1 for hearts, 2 for diamonds, 3 for clubs
        this.value = value; //1 for ace, 2-10 for regular cards, 11-13 for Jack, Queen, King
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
        // maybe upon a click, assign new locations
    }

    @Override
    public void draw(Graphics g) {
        String cardInfo = "images/cards/";
        switch(this.suite) {
            case 0:
                cardInfo += "s";
                break;
            case 1:
                cardInfo += "h";
                break;
            case 2:
                cardInfo += "d";
                break;
            case 3:
                cardInfo += "c";
                break;
        }

        if (this.suite < 11) {
            cardInfo += this.value;
        }
        else {
            switch(this.value) {
                case 11:
                    cardInfo += "j";
                    break;
                case 12:
                    cardInfo += "q";
                    break;
                case 13:
                    cardInfo += "k";
                    break;
            }
        }

        cardInfo += ".png";

        try {
			cardFront = ImageIO.read(new File(cardInfo));
			cardBack = ImageIO.read(new File("images/cards/b1fv.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (isShowing = true) {
            g.drawImage(cardFront, this.x, this.y, null);
        }
        else {
            g.drawImage(cardBack, this.x, this.y, null);
        }
    }

    public int compareTo(Card c){
		return this.getValue() - c.getValue();
	}

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setFacing(boolean b) {
        isShowing = b;
    }
	


}
