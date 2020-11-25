public class Player extends GameEntity {

    private int health;

    public Player(int damage, int health){
        super(damage);
        this.health = health;
    }
}
