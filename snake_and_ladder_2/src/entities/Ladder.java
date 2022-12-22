public class Ladder{
    public Ladder(int start, int end) {
		super(start, end);
	}

	@Override
	public String getEncounterMessage() {
		return "Yeyyy!! You have a ladder to climb :) ";
	}

	@Override
	public String getString() {
		return "🪜️";
	}
}