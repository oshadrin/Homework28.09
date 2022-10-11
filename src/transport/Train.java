package transport;

public class Train extends Transport {

    @Override
    public void refill() {
            System.out.println("Заправка дизелем");
    }

    public Train(String brand, String model, Integer productionYear, String productionCountry, String color, String typeOfFuel) {
        super(brand, model, productionYear, productionCountry, color, typeOfFuel);
    }
}
