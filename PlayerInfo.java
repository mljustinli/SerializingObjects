import java.io.Serializable;

public class PlayerInfo implements Serializable{
	private int health;
	private int hunger;	
	
	public PlayerInfo(int _health, int _hunger) { 
		health = _health;
		hunger = _hunger;
	}
	
	public int getHealth() {return health;}
	public void setHealth(int _health) {health = _health;}
	public int getHunger() {return hunger;}
	public void setHunger(int _hunger) {hunger = _hunger;}
}
