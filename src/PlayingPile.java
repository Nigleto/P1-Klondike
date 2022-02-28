public abstract class PlayingPile extends Pile{
    private Pile currentPile;
    private int x;
    private int y;

    public PlayingPile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addSmallPile(Pile p) { //adds the "smaller" Pile p to the current bigger pile
        Card current = this.getPile().get(0);
        Card end = p.getPile().get(-1);
        if (current.isBlack() != end.isBlack() && current.getValue()-1 == end.getValue()) {
            this.currentPile.addPile(p);
        }
    }
}
