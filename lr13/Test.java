import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();

        System.out.println(" 1. Ошибка при создании ");
        try {
            phones.add(new Phone("Samsung", "", -100, 128, 5000));
        } catch (InvalidPhoneDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Попытка создания завершена.");
        }

        System.out.println("\n 2. Создание нормальных телефонов ");
        try {
            phones.add(new Phone("Apple", "iPhone 15", 999.99, 256, 4000));
            phones.add(new Phone("Samsung", "Galaxy S23", 899.50, 128, 5000));
            System.out.println("Создано телефонов: " + phones.size());
        } catch (InvalidPhoneDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n 3. Обновление цены ");
        try {
            Phone p = phones.get(0);
            p.updatePrice(1100.0);
            p.updatePrice(0);
        } catch (PriceUpdateException | IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Попытка обновления цены завершена.");
        }

        System.out.println("\n 4. Превышение лимита цены ");
        try {
            Phone p = phones.get(1);
            p.updatePrice(3000.0);
        } catch (PriceUpdateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n 5. Увеличение памяти ");
        try {
            Phone p = phones.get(0);
            p.upgradeMemory(512);
            p.upgradeMemory(128);
        } catch (InvalidPhoneDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n 6. Поиск телефона ");
        String searchModel = "Nokia 3310";
        boolean found = false;
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getModel().equals(searchModel)) {
                found = true;
                break;
            }
        }
        if (!found) {
            try {
                throw new PhoneNotFoundException("Телефон \"" + searchModel + "\" не найден в базе!");
            } catch (PhoneNotFoundException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}