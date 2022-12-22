package entities;

public class Freeze extends BoardEntity {
    public Freeze(Integer start, Integer end){
        super(start,end);
    }

    @Override
    public String getEncounterMessage() {
        return "OOPS it's too cold out there... you are freezed...!";
    }

    @Override
    public String getString() {
        return "🧊  ";
    }
    
}
