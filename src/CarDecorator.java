// Базовый декоратор
public class CarDecorator implements CarComponent {
    protected CarComponent decoratedCar;

    public CarDecorator(CarComponent decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void drive() {
        decoratedCar.drive();
    }
}