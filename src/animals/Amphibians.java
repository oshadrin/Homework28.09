package animals;

public class Amphibians extends Animals{

    public void hunt() {

    }

    public Amphibians(String name, String age, String habitat) {
        super(name, age, habitat);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void move() {
        super.move();
    }
}
