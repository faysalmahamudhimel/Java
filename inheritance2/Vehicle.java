package inheritance2 ;


class Vehicle {

    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    double fuelEfficiency() {
        return 0;
    }

    double distanceTraveled(double fuel) {
        return fuel * fuelEfficiency();
    }

    double maximumSpeed() {
        return 0;
    }

    void displayInfo() {

        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Truck extends Vehicle {

    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double fuelEfficiency() {
        return 8;
    }

    @Override
    double maximumSpeed() {
        return 120;
    }
}

class Car extends Vehicle {

    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double fuelEfficiency() {
        return 15;
    }

    @Override
    double maximumSpeed() {
        return 180;
    }
}

class Motorcycle extends Vehicle {

    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double fuelEfficiency() {
        return 40;
    }

    @Override
    double maximumSpeed() {
        return 160;
    }
}