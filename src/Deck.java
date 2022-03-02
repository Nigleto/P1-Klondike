import java.awt.Graphics;
public class Deck extends Pile{
    private int x, y;
 
    public Deck(int x, int y){
        this.x = x;
        this.y = y;
        initDeck();
    }

    private void initDeck() {
      for(int i =0; i<4;i++){ 
        for(int x=1; x<=13;x++){ 
          cards.add(new Card(i, x, this.x, this.y));
        } 
      }
      this.shuffle();  
    }


    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }

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
