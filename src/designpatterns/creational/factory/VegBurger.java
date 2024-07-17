package designpatterns.creational.factory;

public class VegBurger implements Burger{


    @Override
    public Burger prepare() {
        return new VegBurger();
    }


}
