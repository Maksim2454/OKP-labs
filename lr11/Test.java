public class Test {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Base", 2020, 10000);
        ElectricCar e1 = new ElectricCar("Tesla Model 3", 2023, 45000);
        GasolineCar g1 = new GasolineCar("BMW X5", 2022, 60000);

        v1.drive();
        v1.drive(60);
        v1.drive("Минск");

        e1.drive();
        e1.drive(120);
        e1.drive("Москва");

        g1.drive();
        g1.drive(90);
        g1.drive("Гомель");

        System.out.println();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = v1;
        vehicles[1] = e1;
        vehicles[2] = g1;

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].getModel() + " — " + vehicles[i].getFuelType());
        }
    }
}
