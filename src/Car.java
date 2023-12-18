// Класс автомобиля
class Car implements CarComponent{
    private static Car instance;
    private String brand;
    private String model;
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    //public static Car getInstance(String brand, String model) {
      //  if (instance == null) {
       //     instance = new Car(brand, model);
        //}
        //return instance;
    //}

    public void drive() {
        System.out.println("Вождение автомобиля " + brand + " " + model);
    }
}