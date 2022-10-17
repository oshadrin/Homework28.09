package animals.mammals;

import animals.Animals;

public class Herbivores extends Mammals {

    public void graze() {

    }

    public Herbivores(String name, String age, String habitat, String speedMove, String foodType) {
        super(name, age, habitat, speedMove, foodType);
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getHabitat() + " " + getSpeedMove() + " " + getFoodType();
    }
}
