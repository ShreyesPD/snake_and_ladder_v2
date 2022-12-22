package entities;

public class Rocket extends BoardEntity {
    public Rocket(Integer position) {
        super(position, position);
    }

    @Override
    public String getEncounterMessage() {
        return "Yeyyy!! You got a rocket :) ";
    }

    @Override
    public String getString() {
        return "🚀 ";
    }
}
