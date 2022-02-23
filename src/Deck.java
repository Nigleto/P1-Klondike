import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.*;

public class Deck extends Pile{
    private Pile deck;
    private int x, y;
 
    public Deck(int x, int y){
        this.x = x;
        this.y = y;
        deck = new Pile(); 
        initDeck();
    }

    private void initDeck() {
        for(int i =0; i<5;i++){ // 5 since there are 4 suits in a deck
          for(int x=2 ; x<12;x++){ //15 since there are 14 cards in each suit
            deck.add(new Card(i, x+2, 0, 0));
          } 
        }
        deck.shuffle();
      }


    // @Override
    // public void draw(Graphics g) {
    //     // TODO Auto-generated method stub
        
    // }

    // @Override
    // public void update(ActionEvent a) {
    //     // TODO Auto-generated method stub
        
    // }

    // @Override
    // public boolean canAddCard(Card c) {
    //     // TODO Auto-generated method stub
    //     return false;
    // }
    
    

}
