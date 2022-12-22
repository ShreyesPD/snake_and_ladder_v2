public class Snake{
    public Snake(int start, int end) {
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