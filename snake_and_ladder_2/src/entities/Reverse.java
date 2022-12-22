package entities;

public class Reverse extends BoardEntity {
    public Reverse(Integer start, Integer end){
        super(start,end);
    }
    
    @Override
    public String getEncounterMessage() {
        // TODO Auto-generated method stub
        return "Switching to the reverse gear...!";
    }

    @Override
    public String getString() {
        // TODO Auto-generated method stub
        return "↪  ";
    }
}
