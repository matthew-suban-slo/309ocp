package lab.assignment.afterrefactoring.clientcode;
import lab.assignment.afterrefactoring.*;

public class CoffeeClient {
    public static void main(String[] args) {
        CoffeeMaker mocha = new MochaCoffee();
        mocha.prepareCoffee();

        System.out.println("--------------------");

        CoffeeMaker cappuccino = new CappuccinoCoffee();
        cappuccino.prepareCoffee();

        System.out.println("--------------------");

        CoffeeMaker americano = new AmericanoCoffee();
        americano.prepareCoffee();
    }
} 