package DecoratorPattern;

// It is utilizes runtime polymorphism
// Decorator pattern is a structural design pattern which allows users to add new functionalities to an existing object
// without altering its structure.

public class Demo {
    public static void main(String[] args)
    {
        Burger burger = new ZingerBurger();
        System.out.println(burger.getDescription() + ", " + burger.getCost());
        
        burger = new ExtraChesseBurger(burger);
        System.out.println(burger.getDescription() + ", " + burger.getCost());

        burger = new ExtraMayoBurger(burger);
        System.out.println(burger.getDescription() + ", " + burger.getCost());
    }
}
