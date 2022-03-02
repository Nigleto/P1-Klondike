import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.io.File;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.Rectangle;


/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable {
    private int suite;
    private int value;
    private boolean isShowing;
    private boolean isBlack;
    private Image cardFront;
    private Image cardBack;
    private int x, y; //x and y coordinatese of where the card is on the board

    public Card(int suite, int value, int x, int y) {
        this.suite = suite; //0 for spades, 1 for hearts, 2 for diamonds, 3 for clubs
        this.value = value; //1 for ace, 2-10 for regular cards, 11-13 for Jack, Queen, King
        this.x = x;
        this.y = y;
        this.isBlack = this.suite == 0 || this.suite == 3;
        String cardInfo = "../images/cards/";
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
            default:
                cardInfo += this.value;
                break;
        }
        cardInfo += ".png";
        try {
			cardFront = ImageIO.read(new File(cardInfo));
			cardBack = ImageIO.read(new File("../images/cards/b1fv.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

    public int getSuite() {
        return this.suite;
    }

    public int getValue() {
        return this.value;
    }

    public Image getImage() {
        if (this.isShowing == false) {
            return this.cardBack;
        }
        return this.cardFront;
    }
    
    
    @Override
    public void update(ActionEvent a) {
        
    }
    
    @Override
    public void draw(Graphics g) {
        if (isShowing) {
            g.drawImage(cardFront, this.x, this.y, null);
        }
        g.drawImage(cardBack, this.x, this.y, null);
        // String cardInfo = "images/cards/";
        // switch(this.suite) {
        //     case 0:
        //         cardInfo += "s";
        //         break;
        //     case 1:
        //         cardInfo += "h";
        //         break;
        //     case 2:
        //         cardInfo += "d";
        //         break;
        //     case 3:
        //         cardInfo += "c";
        //         break;
        // }

        // if (this.suite < 11) {
        //     cardInfo += this.value;
        // }
        // else {
        //     switch(this.value) {
        //         case 11:
        //             cardInfo += "j";
        //             break;
        //         case 12:
        //             cardInfo += "q";
        //             break;
        //         case 13:
        //             cardInfo += "k";
        //             break;
        //     }
        // }

        // cardInfo += ".png";

        // try {
		// 	cardFront = ImageIO.read(new File(cardInfo));
		// 	cardBack = ImageIO.read(new File("images/cards/b1fv.png"));
		// } catch (IOException e) {
		// 	e.printStackTrace();
		// }

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
	
    public Rectangle getHitBox() {
        return new Rectangle(x,y,71,96);
    }

    public boolean isBlack() {
        return isBlack;
    }

    public boolean containsPoint(int x, int y) {
        return this.getHitBox().contains(x, y);
    }

}
