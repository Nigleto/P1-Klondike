import java.util.*;

public abstract class PlayingPile extends Pile{
    private Pile playingPile; //big pile
    private Pile currentCards; //pile that is to be added
    private Pile cardsFacingUp; //the cards that qualify to add to the big pile


    public void attachPile(Pile p) { //this funciton adds a stack of cards to another stack of cards within the 7 playing piles
        //to add a singular card, just find the index of it, singular cards count as a pile
        for (int i = currentCards.getSize(); i >= 0; i--) { //makes sure the card is facing up
            if (currentCards.getPile().get(i).faceUp() == true) {
                cardsFacingUp.getPile().add(currentCards.getPile().get(i));
            }
        }
        //if the card is alternating colors, add the card to the current playing pile, then remove it from the DrawnCards pile
        if (cardsFacingUp.getPile().size() > 0 && 
        this.playingPile.getPile().get(0).isBlack() != this.cardsFacingUp.getPile().get(cardsFacingUp.getSize()-1).isBlack()) {
            playingPile.addPile(cardsFacingUp);
            cardsFacingUp.getPile().clear();
        }
    }

    

}
