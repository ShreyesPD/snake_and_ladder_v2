package entities;

public abstract class BoardEntity {
    private Integer start;
	private Integer end;
	
	public BoardEntity() {}

	public BoardEntity(Integer start, Integer end) {
		this.start = start;
		this.end = end;
	}
	
	public abstract String getEncounterMessage();
	public abstract String getString();
	
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
}
