package Sims.Character;

public enum ActivityType {
    EAT(10, 30),
    SLEEP(0, 50),
    USE_BATHROOM(0, 5),
    WORKOUT(30,0),
    WATCH_TV(0,10),
    CALL_THE_HOUSEKEEPER(0,0);


    int energyWasted;

    int energyGained;
    ActivityType(int energyWasted, int energyGained) {
        this.energyWasted = energyWasted;
        this.energyGained = energyGained;
    }
}

