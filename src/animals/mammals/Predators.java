package animals.mammals;

public class Predators extends Mammals {

    public void hunt() {

    }

    public Predators(String name, String age, String habitat, String speedMove, String foodType) {
        super(name, age, habitat, speedMove, foodType);
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getHabitat() + " " + getSpeedMove() + " " + getFoodType();
    }
}
