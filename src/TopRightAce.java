
import java.util.*;

public abstract class TopRightAce extends Pile {
    private Pile spadeAcePile; //these piles are initialized yet, probably going to do it in gameboard
    private Pile heartAcePile;
	private Pile diamondAcePile;
	private Pile clubAcePile;

    public void addCardPile(Card x){
        
        switch (x.getSuit()) {
            case 0:
            if(spadeAcePile.getSize() > 0){ 
                if(spadeAcePile.getPile().get(-1).getValue() == x.getValue()-1){ // I did .get(-1) because I was trying to get the last card.
                    spadeAcePile.getPile().add(x);
                }
            }
            break;
            case 1:
            if(heartAcePile.getSize() > 0){
                if(heartAcePile.getPile().get(-1).getValue() == x.getValue()-1){ // I did .get(-1) because I was trying to get the last card.
                    heartAcePile.getPile().add(x);
                }
            }
            break;
            case 2:
            if(diamondAcePile.getSize() > 0){
                if(diamondAcePile.getPile().get(-1).getValue() == x.getValue()-1){ // I did .get(-1) because I was trying to get the last card.
                    diamondAcePile.getPile().add(x);
                }
            }
            break;
            case 3:
            if(clubAcePile.getSize() > 0){
                if(clubAcePile.getPile().get(-1).getValue() == x.getValue()-1){ // I did .get(-1) because I was trying to get the last card.
                    clubAcePile.getPile().add(x);
                }
            }
            break;
        }
    }
    // if(spadeAcePile.getSize() > 0 && x.getSuit() == 0){ //added parameter to make sure the pile has a card to compare
    //     if(spadeAcePile.getPile().get(-1).getValue() == x.getValue()-1){ // I did .get(-1) because I was trying to get the last card.
    //         spadeAcePile.getPile().add(x);
    //     }
        
    // }
    // if(heartAcePile.getSize() > 0 && x.getSuit() == 1){
    //     if(heartAcePile.getPile().get(-1).getValue() == x.getValue()-1){ // I did .get(-1) because I was trying to get the last card.
    //         heartAcePile.getPile().add(x);
    //     }
    // }
    // if(diamondAcePile.getSize() > 0 && x.getSuit() == 2){
    //     if(diamondAcePile.getPile().get(-1).getValue() == x.getValue()-1){ // I did .get(-1) because I was trying to get the last card.
    //         diamondAcePile.getPile().add(x);
    //     }
    // }
    // if(clubAcePile.getSize() > 0 && x.getSuit() == 3){
    //     if(clubAcePile.getPile().get(-1).getValue() == x.getValue()-1){ // I did .get(-1) because I was trying to get the last card.
    //         clubAcePile.getPile().add(x);
    //     }
    // }
    
    
    
}
