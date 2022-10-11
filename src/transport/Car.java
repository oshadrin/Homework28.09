package transport;

import java.security.Key;
import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final Integer productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber = "X000XX000";
    private final int numberOfSeats;
    private boolean seasonTires;
    private Key key;
    private Insurance insurance;

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.isBlank();
    }

    public boolean checkNumber() {
        if (registrationNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{3}")) {
            this.registrationNumber = registrationNumber;
            System.out.println("Номер верный");
        } else {
            System.out.println("Номер не верный");
            return false;
        }
        return true;
    }

    public Car(
            String color, String transmission, String registrationNumber, boolean seasonTires,
            String brand, String model, Integer productionYear, String productionCountry, String bodyType, int numberOfSeats) {
        if (isNullOrEmpty(brand)) {
            this.color = "black";
        } else this.color = color;

        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.bodyType = bodyType;
        this.numberOfSeats = numberOfSeats;
        this.transmission = transmission;
        this.registrationNumber = registrationNumber;
        this.seasonTires = seasonTires;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isSeasonTires() {
        return seasonTires;
    }

    public void setSeasonTires(boolean seasonTires) {
        this.seasonTires = seasonTires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void changeTires() {
        this.seasonTires = !this.seasonTires;
    }


    public static class Key {
        private boolean remoteStart;
        private boolean keyFree;

        public Key(boolean remoteStart, boolean keyFree) {
            this.remoteStart = remoteStart;
            this.keyFree = keyFree;
        }
    }


    public static class Insurance {
        private final LocalDate validUntil;
        private final double cost;
        private final String insuranceNumber;

        public Insurance(LocalDate validUntil, double cost, String insuranceNumber) {
            this.validUntil = validUntil;
            if(validUntil.isBefore(LocalDate.now())) {
                System.out.println("Необходимо оформить новую страховку");
            }
            if (insuranceNumber.length() != 9) {
                System.out.println("Номер страховки неверный");
            }
            this.cost = cost;
            this.insuranceNumber = insuranceNumber;
        }


        public LocalDate getValidUntil() {
            return validUntil;
        }

        public double getCost() {
            return cost;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }
    }
    }

