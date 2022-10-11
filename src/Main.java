import transport.Car;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Flower[] arr = new Flower[4];
        Flower rose = new Flower("Роза обыкновенная", null, "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантемма", null, null, 15, 5);
        Flower peony = new Flower("Пион", null, null, 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);
        arr[0] = rose;
        arr[1] = chrysanthemum;
        arr[2] = peony;
        arr[3] = gypsophila;
        calculateValue(arr);

        Car[] arr2 = new Car[2];
        Car bmw = new Car("black", "hand", "H912PC777", true, "bmw", "xd520", 2020, "Germany", "sedan", 5);
        Car audi = new Car("white", "automatic", "C223PC177", false, "audi", "rx", 2021, "Germany", "sedan", 5);
        arr2[0] = bmw;
        arr2[1] = audi;
        bmw.changeTires();
        audi.changeTires();
        bmw.checkNumber();
        audi.checkNumber();

        Car.Insurance insurance = new Car.Insurance(LocalDate.of(2022, 10,1), 10500, "928398276");
        bmw.setInsurance(insurance);


    }
    public static void calculateValue(Flower arr[]) {
        String composition = "Букет содержит: \n";
        int lifeSpan = Integer.MAX_VALUE;
        double value = 0;
        for (int i = 0; i < arr.length; i++) {
            composition += arr[i].getName() + " из " + arr[i].getCountry() + "\n";
            if(arr[i] != null || arr[i].getLifeSpan() < lifeSpan) {
                    lifeSpan = arr[i].getLifeSpan();
            }
            value += arr[i].getCost();
        }
        value = value * 1.1;
        composition += "\nСумма букета = " + String.format(" %.2f ", value, "\n");
        composition += "Срок годности " + lifeSpan + " дней";
        System.out.println(composition);
    }
}