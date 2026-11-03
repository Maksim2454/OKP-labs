public class GasolineCar extends Vehicle {

    public GasolineCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String getFuelType() {
        return "Бензин";
    }
}
