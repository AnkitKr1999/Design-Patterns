package DecoratorPattern;

public class ExtraChesseBurger extends BurgerDecorator{

    private Burger burger;
    
    public ExtraChesseBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with Extra Cheese";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 10.0;
    }
    
}
