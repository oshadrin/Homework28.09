package animals;

public class Animals {
    private final String name;
    private final String age;
    private String habitat;

    public void eat() {

    }
    public void sleep() {

    }
    public void move() {

    }

    public Animals(String name, String age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if(this.habitat == null || this.habitat.isEmpty()){
            this.habitat = "Должно быть заполнено";
        } else {
            this.habitat = habitat;
        }
    }
}
