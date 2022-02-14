import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.*;

public class Deck extends Pile{
    private Pile deck;
 
    public Deck(){
        deck = new Pile();
        initDeck();
    }

    private void initDeck() {
        for(int i =1; i<5;i++){ // 5 since there are 4 suits in a deck
          for(int x=1; x<15;x++){ //15 since there are 14 cards in each suit
            deck.add(new Card(i, x));
          } 
        }
      }

    deck.shuffle();

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean canAddCard(Card c) {
        // TODO Auto-generated method stub
        return false;
    }
    
    

}
