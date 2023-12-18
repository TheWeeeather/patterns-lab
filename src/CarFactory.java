// Абстрактный класс для создания автомобилей
abstract class CarFactory {
    public void deliverCar(String brand, String model) {
        Car car = createCar(brand, model);
        car.drive();
    }

    protected abstract Car createCar(String brand, String model);
}