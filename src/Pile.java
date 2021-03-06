import java.util.ArrayList;
import java.awt.Graphics;
/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public class Pile{ //0 is the top card, the one we see
    
  //public boolean canAddCard(Card c);
  protected ArrayList<Card> cards;


  public Pile(){
    cards = new ArrayList<>();
  }

  public void add(Card x){ 
    this.cards.add(x); // I'm not sure if this would work...
  }

  public void add(int i, Card x) {
    this.cards.add(i, x);
  }

  public ArrayList<Card> getPile(){
    return this.cards;
  }

  public void drawTopCard(Graphics g) { //shows the top card
    cards.get(0).draw(g);
  }

  public void addPile(Pile p) {
    // for (int i = 0; i < p.getPile().size(); i++) {
    //   this.cards.add(p.getPile().get(i));
    // }
    this.cards.addAll(p.cards);
  }

  public Card deal() { //retrieves top card, removes it from the pile it was in
    Card c = this.cards.get(0);
    cards.remove(0);
    return c;
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
    for (int i = 0; i < cards.size() * 2; i++) {
      int x = (int)(Math.random() * cards.size());
      int y = (int)(Math.random() * cards.size());
      if(x != y){
        if(Math.random() < 0.5){
          Card yo = cards.get(x);
          cards.set(x, cards.get(y));
          cards.set(y, yo);

        }
        return;
      }
    }
  }
}
