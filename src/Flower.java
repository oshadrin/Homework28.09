public class Flower {

    private final String name;
    private final String flowerColor;
    private final String country;
    private double cost = 0;
    private int lifeSpan = 0;

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;

        if (flowerColor == null || !flowerColor.isEmpty() || !flowerColor.isBlank() ) {
            flowerColor = "Белый";
        }
        this.flowerColor = flowerColor;

        if (country == null) {
            country = "Россия";
        }
        this.country = country;

        if(cost <= 0 ) {
            cost = 1;
        } else {
            this.cost = cost;
        }

        if (lifeSpan <= 0) {
            lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }

    }

    public String getName() {
        return name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

}

