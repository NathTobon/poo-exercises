package Services;

import Entity.CoffeeMaker;

public class CoffeeMakerServices {

    public CoffeeMaker createCoffeeMaker(int maxCapacity, int currentCapacity) {
        CoffeeMaker coffeeMaker = new CoffeeMaker(maxCapacity, currentCapacity);
        return coffeeMaker;
    }

    public void fillCoffeeMaker(CoffeeMaker coffeeMaker) {
        int maxCapacity = coffeeMaker.getMaxCapacity();
        int currentCapacity = maxCapacity;
        coffeeMaker.setCurrentCapacity(currentCapacity);
    }

    public int fillCup(CoffeeMaker coffeeMaker, int cupSize) {
        int currentCapacity = coffeeMaker.getCurrentCapacity();
        currentCapacity = currentCapacity - cupSize;
        int ret;
        if (currentCapacity < 0) {
            ret = cupSize - Math.abs(currentCapacity);
            coffeeMaker.setCurrentCapacity(0);
        } else {
            ret = cupSize;
        }
        return ret;
    }

    public void emptyCoffeeMaker(CoffeeMaker coffeeMaker) {
        coffeeMaker.setCurrentCapacity(0);
    }

    public void addCoffee(CoffeeMaker coffeeMaker, int coffeeAmount) {
        int currentCapacity = coffeeMaker.getCurrentCapacity();
        currentCapacity = currentCapacity + coffeeAmount;
        int maxCapacity = coffeeMaker.getMaxCapacity();
        if (currentCapacity > maxCapacity) {
            coffeeMaker.setCurrentCapacity(maxCapacity);
        }

    }

}
