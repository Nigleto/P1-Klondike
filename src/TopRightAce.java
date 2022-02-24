
import java.util.*;

public class TopRightAce extends Pile {
    private Pile spadeAcePile;
    private Pile heartAcePile;
	private Pile diamondAcePile;
	private Pile clubAcePile;

    private Pile acePile;
    private int pileSuite;
    private int x, y;

    public TopRightAce(int pileSuite, int x, int y) {
        this.x = x;
        this.y = y;
        acePile = new Pile();
        this.pileSuite = pileSuite;
    }

    public void addCardPile(Card x){ // this wont work we have to figure out how to move cards by the pile first
        if(x.getSuite() == 0){
            if(spadeAcePile.getPile().get(-1).getValue() == x.getValue()-1 || x.getValue()-1 == 0){ // I did .get(-1) because I was trying to get the last card.
                spadeAcePile.getPile().add(x);
            }
            
        }
        if(x.getSuite() == 1){
            if(heartAcePile.getPile().get(-1).getValue() == x.getValue()-1 || x.getValue()-1 == 0){ // I did .get(-1) because I was trying to get the last card.
                heartAcePile.getPile().add(x);
            }
        }
        if(x.getSuite() == 2){
            if(diamondAcePile.getPile().get(-1).getValue() == x.getValue()-1 || x.getValue()-1 == 0){ // I did .get(-1) because I was trying to get the last card.
                diamondAcePile.getPile().add(x);
            }
        }
        if(x.getSuite() == 3){
            if(clubAcePile.getPile().get(-1).getValue() == x.getValue()-1 || x.getValue()-1 == 0){ // I did .get(-1) because I was trying to get the last card.
                clubAcePile.getPile().add(x);
            }
        }
    }

    public void addCardToAce(Card x) {
        if (this.pileSuite == x.getSuite() && x.getValue() == acePile.getPile().get(0).getValue()+1) {
            acePile.add(0, x);
        }
    }




}
