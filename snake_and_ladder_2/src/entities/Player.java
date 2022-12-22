
import entities.BoardEntity;

public class Player extends BoardEntity
{
    Integer position;
	String userName;
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Player(String userName) {
		
		position = 0;
		this.userName = userName; 
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String getEncounterMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return userName;
	}


}