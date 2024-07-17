package designpatterns.creational.factory;

public class ChickenBurger implements Burger{
    @Override
    public Burger prepare() {
        return new ChickenBurger();
    }
}
