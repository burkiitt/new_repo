package lambda_expression;
import java.util.function.Consumer;
public class Test2 {
    public static void chainCar(Car car , Consumer<Car> consumer) {
        consumer.accept(car);
    }
    public static void main(String[] args) {
        Car car  = new Car("Red",15000,1.6);
        System.out.println(car);
        chainCar(car, x ->{
            car.color="Green";
            car.engine=3.5;
            car.price=300000;
        });
        System.out.println(car);
    }
}
class Car{
    String color;
    int price;
    double engine;

    public Car(String color, int price, double engine) {
        this.color = color;
        this.price = price;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", engine=" + engine +
                '}';
    }
}