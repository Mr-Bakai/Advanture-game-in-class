
public class Enemies  extends GameEntity{
    int health;
    String name;

    public Enemies(String name, int damage, int health){
        super(damage);
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth (){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }
}
