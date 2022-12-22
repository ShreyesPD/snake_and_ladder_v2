
import entities.BoardEntity;

public class Player extends BoardEntity
{
    Private Integer position;
	Private String userName;
	Private Integer direction;

	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Player(String userName) {
		
		position = 0;
		this.userName = userName;
		this.direction=1;

	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Integer getDirection() {
		return position;
	}

	public void setDirection(int position) {
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