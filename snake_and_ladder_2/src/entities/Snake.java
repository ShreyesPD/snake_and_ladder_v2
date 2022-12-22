package entities;

public class Snake extends BoardEntity{
    public Snake(Integer start, Integer end) {
		super(start, end);
		
	}

	@Override
	public String getEncounterMessage() {
		return "Ooops!! You encountered a Snake :( ";
		
	}

	@Override
	public String getString() {	
		return "🐍️ ";
	}

}