public class Phone {
    private String brand;
    private String model;
    private double price;
    private int memory;
    private int battery;

    public Phone(String brand, String model, double price, int memory, int battery)
            throws InvalidPhoneDataException {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setMemory(memory);
        setBattery(battery);
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) throws InvalidPhoneDataException {
        if (brand == null || brand.trim().isEmpty()) {
            throw new InvalidPhoneDataException("Бренд не может быть пустым");
        }
        this.brand = brand;
    }

    public String getModel() { return model; }
    public void setModel(String model) throws InvalidPhoneDataException {
        if (model == null || model.trim().isEmpty()) {
            throw new InvalidPhoneDataException("Модель не может быть пустой");
        }
        this.model = model;
    }

    public double getPrice() { return price; }
    public void setPrice(double price) throws InvalidPhoneDataException {
        if (price <= 0) {
            throw new InvalidPhoneDataException("Цена должна быть больше 0");
        }
        this.price = price;
    }

    public int getMemory() { return memory; }
    public void setMemory(int memory) throws InvalidPhoneDataException {
        if (memory <= 0) {
            throw new InvalidPhoneDataException("Память должна быть больше 0");
        }
        this.memory = memory;
    }

    public int getBattery() { return battery; }
    public void setBattery(int battery) throws InvalidPhoneDataException {
        if (battery <= 0) {
            throw new InvalidPhoneDataException("Емкость батареи должна быть больше 0");
        }
        this.battery = battery;
    }

    public void updatePrice(double newPrice) throws PriceUpdateException {
        if (newPrice <= 0) {
            throw new PriceUpdateException("Новая цена должна быть больше 0");
        }
        if (newPrice > this.price * 2) {
            throw new PriceUpdateException("Цена не может быть увеличена более чем в 2 раза");
        }
        this.price = newPrice;
        System.out.println("Цена телефона " + brand + " " + model + " успешно обновлена на " + newPrice);
    }

    public void upgradeMemory(int newMemory) throws InvalidPhoneDataException {
        if (newMemory <= this.memory) {
            throw new InvalidPhoneDataException("Новая память должна быть больше текущей (" + this.memory + " ГБ)");
        }
        this.memory = newMemory;
        System.out.println("Память телефона " + brand + " " + model + " увеличена до " + newMemory + " ГБ");
    }
}
