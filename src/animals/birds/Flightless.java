package animals.birds;

public class Flightless extends Birds {

    public void walk() {

    }

    public Flightless(String name, String age, String habitat, String moveType) {
        super(name, age, habitat, moveType);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getHabitat() + " " + getMoveType();
    }
}
