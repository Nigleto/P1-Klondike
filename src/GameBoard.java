import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GameBoard implements Drawable, Updateable {
	

	Image testImage, backImage, emptyIndicator;	
	public static final int OFFSET_X = 40, OFFSET_Y = 20;
	private Deck d;
	private Pile drawnPile;
	private Pile playPile;
	private Pile sPile;
	private Pile hPile;
	private Pile dPile;
	private Pile cPile;
	private Pile pile1;
    private Pile pile2;
    private Pile pile3;
    private Pile pile4;
    private Pile pile5;
    private Pile pile6;
    private Pile pile7;
	
	 
	private int numdraws=0;
	
	
	
	public GameBoard() {
		try {
			// testImage = ImageIO.read(new File("images/cards/dj.png"));
			// backImage = ImageIO.read(new File("images/cards/b1fv.png"));
			BufferedImage sheet = ImageIO.read(new File("../images/cards/cardsheet.png"));
			emptyIndicator = sheet.getSubimage(71*10, 96*4, 71, 96);
			d = new Deck(20, 80);
			drawnPile = new DrawnCards(120, 80);
			sPile = new TopRightAce(0, 600, 80);
			hPile = new TopRightAce(1, 691, 80);
			dPile = new TopRightAce(2, 782, 80);
			cPile = new TopRightAce(3, 873, 80);
			pile1 = new PlayingPile(220, 300);
			pile2 = new PlayingPile(300, 300);
			pile3 = new PlayingPile(380, 300);
			pile4 = new PlayingPile(460, 300);
			pile5 = new PlayingPile(540, 300);
			pile6 = new PlayingPile(620, 300);
			pile7 = new PlayingPile(700, 300);


			// INITIALIZING THE PLAYING PILES BELOW
			pile1.getPile().add(d.deal());
        	pile2.getPile().add(d.deal());
        	pile2.getPile().add(d.deal());
        	for(int i=0; i<3; i++){
            	pile3.getPile().add(d.deal()); 
        	}
			for(int i=0; i<4; i++){
            	pile4.getPile().add(d.deal()); 
        	}
			for(int i=0; i<5; i++){
            	pile5.getPile().add(d.deal()); 
        	}
			for(int i=0; i<6; i++){
            	pile6.getPile().add(d.deal()); 
        	}
			for(int i=0; i<7; i++){
            	pile7.getPile().add(d.deal()); 
        	}
			// INITIALIZING PLAYING PILES ABOVE

		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/** @param g Graphics context onto which all Objects in the game
	 * draw themselves.  This should NOT change the Objects
	 */
	public void draw(Graphics g) {
		// numdraws++;
		g.setColor(new Color(40, 155, 70));
		g.fillRect(0, 0, 3000, 2000);
		
		// this is just to test drawing a card
		// g.drawImage(testImage, 30, 80, null);
		// g.drawImage(backImage, 100, 80, null);
		// g.drawImage(backImage, 105, 100, null);
		g.drawImage(emptyIndicator, 20, 80, null); //deck 
		g.drawImage(emptyIndicator, 120, 80, null); //drawn pile

		for (int i = 0; i < 4; i++) { //ace pile
			g.drawImage(emptyIndicator, (600+(i*91)), 80, null);
		}

		for (int i = 0; i < 7; i ++) { //playing piles
			g.drawImage(emptyIndicator, (220+(i*80)), 300, null);
		}

		//beginning to place cards on the board

		d.deal().draw(g);





		// Card test1 = new Card(0, 5, 0, 0); //tests using methods built in the card class
		// test1.draw(g);
		// Card test1 = new Card(0, 5, 0, 0); //tests using methods built in the card class
		// test1.draw(g);
	}


	/**
	 * This method is called by the game when a click has been made 
	 * on the panel.  Must determine if the click makes sense (is it 
	 * a valid location, If it is the first click, then note it and
	 * the next click will attempt a move (maybe).
	 * @param me
	 */

	public void justClicked(MouseEvent me) { //card width: 71, card height: 96
		Point p = me.getPoint();
		int x = me.getX();
		int y = me.getY();

		
		System.out.println("You just clicked "+p);


	}

	@Override
	// this update will be called each time the timer in the KlondikeGame
	// goes off.  This will be convenient for animating.
	public void update(ActionEvent a) {

		
	}

}
