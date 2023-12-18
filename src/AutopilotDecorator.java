// Декоратор для добавления функции автопилота
public class AutopilotDecorator extends CarDecorator {
    public AutopilotDecorator(CarComponent decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void drive() {
        super.drive();
        enableAutopilot();
    }

    private void enableAutopilot() {
        System.out.println("Автопилот включен");
    }
}
