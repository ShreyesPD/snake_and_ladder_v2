package entities;

public class Ladder extends BoardEntity{
    public Ladder(Integer start, Integer end) {
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