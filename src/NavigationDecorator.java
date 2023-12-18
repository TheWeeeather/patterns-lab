// Декоратор для добавления функции навигации
public class NavigationDecorator extends CarDecorator {
    public NavigationDecorator(CarComponent decoratedCar) {
        super(decoratedCar);
    }
    private void enableNavigation() {
        System.out.println("Навигация включена");
    }
    @Override
    public void drive() {
        super.drive();
        enableNavigation();
    }
}