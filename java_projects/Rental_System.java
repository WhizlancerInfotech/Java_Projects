import java.util.*;

class Car {
    String model;
    boolean isAvailable = true;

    Car(String model) {
        this.model = model;
    }
}

public class CarRental {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota"));
        cars.add(new Car("Honda"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Available Cars:");
        for (Car c : cars) {
            if (c.isAvailable) System.out.println(c.model);
        }

        System.out.print("Enter car to rent: ");
        String carName = sc.nextLine();
        for (Car c : cars) {
            if (c.model.equals(carName) && c.isAvailable) {
                c.isAvailable = false;
                System.out.println("Car rented: " + c.model);
                break;
            }
        }
        sc.close();
    }
}
