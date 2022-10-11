package transport;

public class Bus extends Transport{


    @Override
    public void refill() {
        if(getTypeOfFuel().equals("gas")){
            System.out.println("Заправка автобуса бензином");
        } else {
            System.out.println("Заправка автобуса дизелем");
        }

    }

    public Bus(String brand, String model, Integer productionYear, String productionCountry, String color, String typeOfFuel) {
        super(brand, model, productionYear, productionCountry, color, typeOfFuel);
    }
}
