package animals.birds;

public class Flying extends Birds{

    public void fly() {

    }

    public Flying(String name, String age, String habitat, String moveType) {
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
