package Week13.task6;

import java.util.ArrayList;
import java.util.List;

class Coffee{
    private String type;
    private String size;
    private List<String> toppings;

    public Coffee(){
        this.toppings=new ArrayList<>();
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void addTopping(String topping){
        this.toppings.add(topping);
    }

    @Override
    public String toString(){
        return "Coffe{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}

interface CoffeeBuilder{
    void buildType();
    void buildSize();
    void buildToppings();
    Coffee getCoffee();
}

class EspressoBuilder implements CoffeeBuilder{
    private Coffee coffee;

    public EspressoBuilder(){
        this.coffee=new Coffee();
    }

    @Override
    public void buildType(){
        coffee.setType("Espesso");
    }

    @Override
    public void buildSize(){
        coffee.setSize("Regular");
    }

    @Override
    public void buildToppings(){
        coffee.addTopping("Whipped Cream");
    }

    @Override
    public Coffee getCoffee(){
        return coffee;
    }
}

class LatteBuilder implements CoffeeBuilder{
    private Coffee coffee;

    public LatteBuilder(){
        this.coffee=new Coffee();
    }

    @Override
    public void buildType(){
        coffee.setType("Latte");
    }

    @Override
    public void buildSize(){
        coffee.setSize("Large");
    }

    @Override
    public void buildToppings(){
        coffee.addTopping("Caramel Syrup");
    }

    @Override
    public Coffee getCoffee(){
        return coffee;
    }
}

class CappuccinoBuilder implements CoffeeBuilder{
    private Coffee coffee;

    public CappuccinoBuilder(){
        this.coffee=new Coffee();
    }

    @Override
    public void buildType(){
        coffee.setType("Cappuccino");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Medium");
    }

    @Override
    public void buildToppings() {
        coffee.addTopping("Cinnamon Powder");
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}

class CoffeeDirector {
    public void constructCoffee(CoffeeBuilder builder) {
        builder.buildType();
        builder.buildSize();
        builder.buildToppings();
    }
}

public class Start {
    public static void main(String[] args) {
        CoffeeDirector director = new CoffeeDirector();

        CoffeeBuilder espressoBuilder = new EspressoBuilder();
        director.constructCoffee(espressoBuilder);
        Coffee espresso = espressoBuilder.getCoffee();
        System.out.println("Espresso: " + espresso);

        CoffeeBuilder latteBuilder = new LatteBuilder();
        director.constructCoffee(latteBuilder);
        Coffee latte = latteBuilder.getCoffee();
        System.out.println("Latte: " + latte);

        CoffeeBuilder cappuccinoBuilder = new CappuccinoBuilder();
        director.constructCoffee(cappuccinoBuilder);
        Coffee cappuccino = cappuccinoBuilder.getCoffee();
        System.out.println("Cappuccino: " + cappuccino);
    }
}
