// Конкретная фабрика для создания автомобилей определенной марки
class FordCarFactory extends CarFactory {
    @Override
    protected Car createCar(String brand, String model) {
        return new Car("Ford", model);
    }
}