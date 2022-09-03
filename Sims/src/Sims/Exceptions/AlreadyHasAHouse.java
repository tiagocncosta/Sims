package Sims.Exceptions;

public class AlreadyHasAHouse extends SimsException{
    public AlreadyHasAHouse() {
        super("You already have a house, stop being stupid!");
    }
}
