import java.util.ArrayList;
/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public class Pile{
    
    //public boolean canAddCard(Card c);
    private ArrayList<Card> cards;


    public Pile(){
      cards = new ArrayList<>();
    }

    public void add(Card x){ 
        this.add(x); // I'm not sure if this would work...
    }

    public ArrayList<Card> getPile(){
      return this.cards;
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
    
  
    for(int i=0; i<cards.size(); i++){
  
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
