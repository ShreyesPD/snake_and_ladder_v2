
package entities;

public class Player extends BoardEntity
{
    private Integer position;
	private String userName;
	private Boolean direction;
	private Boolean movement;

	public Boolean getMovement() {
		return movement;
	}

	public void setMovement(Boolean movement) {
		this.movement = movement;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Player(String userName) {
		
		position = 0;
		this.userName = userName;
		this.direction=true;
		this.movement=true;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Boolean getDirection() {
		return direction;
	}

	public void setDirection(Boolean direction) {
		this.direction = direction;
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