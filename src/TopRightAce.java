
import java.util.*;

public abstract class TopRightAce extends Pile {
    private Pile spadeAcePile;
    private Pile heartAcePile;
	private Pile diamondAcePile;
	private Pile clubAcePile;

    public void addCardPile(Card x){
        if(x.getSuit() == 0){
            int spadeSize = spadeAcePile.getPile().size();
            if(spadeAcePile.getPile().get(-1).getValue() == x.getValue()-1){ // I did .get(-1) because I was trying to get the last card.
                spadeAcePile.getPile().add(x);
            }
            
        }
        if(x.getSuit() == 1){
            if(heartAcePile.getPile().get(-1).getValue() == x.getValue()-1){ // I did .get(-1) because I was trying to get the last card.
                heartAcePile.getPile().add(x);
            }
        }
        if(x.getSuit() == 2){
            if(diamondAcePile.getPile().get(-1).getValue() == x.getValue()-1){ // I did .get(-1) because I was trying to get the last card.
                diamondAcePile.getPile().add(x);
            }
        }
        if(x.getSuit() == 3){
            if(clubAcePile.getPile().get(-1).getValue() == x.getValue()-1){ // I did .get(-1) because I was trying to get the last card.
                clubAcePile.getPile().add(x);
            }
        }
    }



}
