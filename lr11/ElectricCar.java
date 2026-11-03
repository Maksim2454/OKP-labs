public class ElectricCar extends Vehicle {

    public ElectricCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String getFuelType() {
        return "Электричество";
    }
}
