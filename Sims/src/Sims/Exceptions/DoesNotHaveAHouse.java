package Sims.Exceptions;

public class DoesNotHaveAHouse extends SimsException{
    public DoesNotHaveAHouse() {
        super("You need to buy a house first");
    }
}
