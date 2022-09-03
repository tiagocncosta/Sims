package Sims;

import Sims.Character.ActivityType;
import Sims.Character.Character;
import Sims.Exceptions.GoToBathroom;
import Sims.House.House;
import Sims.Exceptions.AlreadyHasAHouse;

import static Sims.Character.ActivityType.*;

public class Main {

    public static void main(String[] args) throws AlreadyHasAHouse {


        Character john = new Character();

        House house = new House();

        try {
            john.buyHouse(house);
            john.doActivity(EAT);
            john.doActivity(USE_BATHROOM);
            john.doActivity(WORKOUT);
            john.doActivity(WORKOUT);
            john.doActivity(WORKOUT);
            john.doActivity(SLEEP);
            john.doActivity(SLEEP);
            john.doActivity(WORKOUT);
            john.doActivity(WORKOUT);
            john.doActivity(WORKOUT);
            john.doActivity(WATCH_TV);

        } catch (Exception e) {
            System.out.println(e.getMessage());


        }
    }
}
