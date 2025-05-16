package lab.assignment.afterrefactoring;

public abstract class CoffeeMaker {
    
    // Template method
    public final void prepareCoffee() {
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    // Common methods
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void addIngredients();
    protected abstract void finalTouch();
} 