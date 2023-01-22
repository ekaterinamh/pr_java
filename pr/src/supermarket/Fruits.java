package supermarket;

public class Fruits extends Supermarket{
    private int storageTime;
    private int temperature;

    public Fruits(String nameOfDept, String nameOfProduct, String country, int retailPrice, String supplier, int storageTime, int temprature) {
        super(nameOfDept, nameOfProduct, country, retailPrice, supplier);
        this.storageTime = storageTime;
        this.temperature = temprature;
    }

    public void setStorageTime(int storageTime) {
        this.storageTime = storageTime;
    }

    public int getStorageTime() {
        return storageTime;
    }

    public void setTemprature(int temprature) {
        this.temperature = temprature;
    }

    public int getTemprature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Фрукты{" +

                "название отдела='" + nameOfDept + '\'' +
                ", название продукта='" + nameOfProduct + '\'' +
                ", страна-производитель='" + country + '\'' +
                ", розничная цена=" + retailPrice +
                ", поставщик='" + supplier + '\'' +
                ", максимальное время хранения=" + storageTime +
                ", температура хранения=" + temperature +
                '}';
    }
}