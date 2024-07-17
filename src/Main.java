import designpatterns.creational.factory.Burger;
import designpatterns.creational.factory.ChickenBurger;
import designpatterns.creational.factory.VegBurger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        //Factory design pattern
        Burger burger = null;
        String type = "vegburger";
        switch (type) {
            case "vegburger":
                burger = new VegBurger();
                break;
            case "chickenburger":
                burger = new ChickenBurger();
                break;
            default:
                break;
        }
    }
}