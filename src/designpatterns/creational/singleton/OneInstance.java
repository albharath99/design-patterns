package designpatterns.creational.singleton;

public class OneInstance {

    // private constructor makes sure that no other class can create object of this class.d
    private OneInstance() {

    }

    private static OneInstance INSTANCE = null;

    public static OneInstance getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new OneInstance();
        }
        return INSTANCE;
    }
}
