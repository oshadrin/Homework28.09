package animals.mammals;

import animals.Animals;

public class Mammals extends Animals {

    private String speedMove;
    private String foodType;

    public void walk() {

    }

    public Mammals(String name, String age, String habitat, String speedMove, String foodType) {
        super(name, age, habitat);
        this.speedMove = speedMove;
        this.foodType = foodType;
    }

    public String getSpeedMove() {
        return speedMove;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setSpeedMove(String speedMove) {
        this.speedMove = speedMove;
    }

    public void setFoodType(String foodType) {
        if(this.foodType == null || this.foodType.isEmpty()){
            this.foodType = "Должно быть заполнено";
        } else {
            this.foodType = foodType;
        }
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
