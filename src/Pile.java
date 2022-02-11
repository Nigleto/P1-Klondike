import java.util.ArrayList;
/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public abstract class Pile implements Drawable, Updateable {
    
    public abstract boolean canAddCard(Card c);
    //ArrayList<Card> cards = new ArrayList<>();


    public Pile(){
        ArrayList<Card> cards = new ArrayList<>();
    }

    public void add(Card x){ 
        this.add(x); // I'm not sure if this would work...
    }

    private void initDeck() {
      for(int i =1; i<5;i++){ // 5 since there are 4 suits in a deck
        for(int x=1; x<15;x++){ //15 since there are 14 cards in each suit
          add(new Card(i, x));
        } 
      }
    }

    public void shuffle() {
        /* Randomizes the cards in this deck. 
      * You must use the following algorithm:
      * If the size is < 2, return;
      * If the size == 2, "flip a coin", swap if "heads"
      * If the size > 2 repeat the following steps size() * 2 times:
      * select two different indexes (make sure they are different)
      * swap them in the ArrayList
      */ 
    boolean coin = false;
    
  
    for(int i=0; i<deck.size(); i++){
  
      if(cards.size() < 2){
        return;
      }
  
      if(cards.size() == 2){
        if(Math.random() < 0.5){
          Card x = cards.get(0);
          cards.set(0, cards.get(1));
          cards.set(1, x);
  
        }
        return;
      }
  
    
      if(cards.size() > 2){
        int x = (int)Math.random() * cards.size();
        int y = (int)Math.random() * cards.size();
        if(x != y){
          if(Math.random() < 0.5){
            Card yo = cards.get(x);
            cards.set(x, cards.get(1));
            cards.set(y, yo);
  
        }
        }
      return;
    }
    }
  }


}
