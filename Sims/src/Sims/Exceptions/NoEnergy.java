package Sims.Exceptions;

public class NoEnergy extends SimsException{
    public NoEnergy() {
        super("You don't have enough energy for this activitie");
    }
}
