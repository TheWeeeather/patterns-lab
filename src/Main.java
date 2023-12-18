public class Main {
    public static void main(String[] args) {
        // Используем Одиночку
        Car car1 = new Car("Mercedes", "C-Class");
        car1.drive();

        Car car2 = new Car("BMW", "X5");
        car2.drive();
        // Используем Фабричный метод
        CarFactory fordFactory = new FordCarFactory();
        Car fordCar = fordFactory.createCar("Ford", "Focus");
        fordCar.drive();

        CarFactory toyotaFactory = new ToyotaCarFactory();
        Car toyotaCar = toyotaFactory.createCar("Toyota", "Camry");
        toyotaCar.drive();

        // Используем Декоратор
        CarComponent carWithAutopilot = new AutopilotDecorator(car1);
        carWithAutopilot.drive();

        CarComponent carWithNavigation = new NavigationDecorator(car2);
        carWithNavigation.drive();

        CarComponent carWithAutopilotAndNavigation = new AutopilotDecorator(new NavigationDecorator(car1));
        carWithAutopilotAndNavigation.drive();
    }
}