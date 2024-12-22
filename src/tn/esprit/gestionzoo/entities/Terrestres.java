package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.enums.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestres extends Animal implements Omnivore<Food> {
    int nbLegs;
    public Terrestres(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbLegs = nbrLegs;
    }
    @Override
    public void eatMeat(Food meat) {
        System.out.println("The Terrestrial " + getName() + " is eating " + meat);
    }

    @Override
    public void eatPlants(Food plant) {
        System.out.println("The Terrestrial " + getName() + " is eating " + plant);

    }

    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println("The Terrestrial " + getName() + " is eating " + food + " plants and meat");

    }
}
