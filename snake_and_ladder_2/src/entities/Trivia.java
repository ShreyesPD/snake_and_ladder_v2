package entities;

public class Trivia extends BoardEntity{

    public Trivia(int start, int end) {
        super(start, end);
    }

    @Override
    public String getEncounterMessage() {
        // TODO Auto-generated method stub
        return "whoa...you are on the hot seat";
    }

    @Override
    public String getString() {
        // TODO Auto-generated method stub
        return "❓  ";
    }
    
}
