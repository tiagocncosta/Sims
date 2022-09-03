package Sims.Character;

import Sims.Exceptions.*;
import Sims.House.House;

import static Sims.Character.ActivityType.*;
import static Sims.House.Divisions.*;
import static Sims.Messages.*;

public class Character {
    private House house;

    private ActivityType activity;

    private int energylevel;
    private boolean wcNeeds;

    public Character() {
        this.energylevel = 100;
        this.wcNeeds = false;
    }

    public void buyHouse(House house) throws AlreadyHasAHouse {
        if (this.house != null){
            throw new AlreadyHasAHouse();
        }
        house.buy();
        this.house = house;
        System.out.println(NEW_HOUSE);
    }

    public House getHouse() {
        return house;
    }

    public int getEnergylevel() {
        return energylevel;
    }

    public void doActivity(ActivityType activity) throws DoesNotHaveAHouse, NoEnergy, NeedToClean, GoToBathroom {
        if (getHouse() == null){
            throw new DoesNotHaveAHouse();
        }
        if (house.getLevelOfDirtiness() == 100 && activity != CALL_THE_HOUSEKEEPER ) {
            throw new NeedToClean();
        }
        if (this.energylevel + (activity.energyGained - activity.energyWasted) < 0){
            throw new NoEnergy();
        }

        if (wcNeeds && activity != USE_BATHROOM && activity != CALL_THE_HOUSEKEEPER) {
            throw new GoToBathroom();
        }

        int effectiveEnergy = activity.energyGained - activity.energyWasted;
        this.energylevel = Math.min( energylevel+ effectiveEnergy, 100);
        System.out.printf("You now have %d of energy. %n.", energylevel);

        switch (activity){
            case EAT:
                eat();
                break;
            case USE_BATHROOM:
                goToBathroom();
                break;
            case SLEEP:
                sleep();
                break;
            case WATCH_TV:
                watchTv();
                break;
            case WORKOUT:
                workout();
        }
    }
    public void eat(){
    this.house.useRoom(KITCHEN);
    this.wcNeeds = true;
    }

    public void goToBathroom(){
        this.house.useRoom(BATHROOM);
        wcNeeds = false;
    }

    public void watchTv(){
        this.house.useRoom(LIVINGROOM);
    }

    public void workout(){
        this.house.useRoom(GYM);
    }

    public void sleep(){
        this.house.useRoom(BEDROOM);
    }
}
