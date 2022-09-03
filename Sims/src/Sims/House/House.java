package Sims.House;

import Sims.Main;

import static Sims.Messages.*;

public class House {

    private boolean hasOwner;

    private int levelOfDirtiness;

    public House() {
        this.hasOwner = false;
        this.levelOfDirtiness = 0;
    }

    public void buy() {
        this.hasOwner = true;
    }

    public void needToClean(){
        if (levelOfDirtiness == 100){
            System.out.println(NEED_TO_CLEAN);
        }
    }

    public void use(Divisions division){
        levelOfDirtiness += division.getDirtnessGenerated();
    }

    public int getLevelOfDirtiness() {
        return levelOfDirtiness;
    }

    public void useRoom(Divisions division){
        levelOfDirtiness  = Math.min(levelOfDirtiness + division.getDirtnessGenerated(), 100);
    }
}
