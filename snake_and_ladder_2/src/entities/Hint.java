package entities;

public class Hint extends BoardEntity{

    public Hint(int start, int end) {
        super(start, end);
    }

    @Override
    public String getEncounterMessage() {
       return "You got a hint!";
        
    }

    @Override
    public String getString() {      
        return "💡️";
    }
    
}