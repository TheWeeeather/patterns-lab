// Конкретная фабрика для создания автомобилей определенной марки
class ToyotaCarFactory extends CarFactory {
    @Override
    protected Car createCar(String brand, String model) {
        return new Car("Toyota", model);
    }
}