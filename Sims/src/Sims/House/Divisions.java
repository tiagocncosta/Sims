package Sims.House;

public enum Divisions {
    BATHROOM(10),
    GYM(15),
    KITCHEN(20),
    LIVINGROOM(10),
    BEDROOM(5);

    private final int dirtnessGenerated;

    Divisions(int dirtnessGenerated) {
        this.dirtnessGenerated = dirtnessGenerated;
    }

    public int getDirtnessGenerated() {
        return dirtnessGenerated;
    }
}
