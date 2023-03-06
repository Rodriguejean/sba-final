import Car;
import Trucks;

class Main {
  public static void main(String[] args) {
      Car car = new Car(100, 10000, "blue");
        Ford ford = new Ford(120, 20000, "red", 2022, 500);

        System.out.println("Car sale price: " + car.getSalePrice());
        System.out.println("Ford sale price: " + ford.getSalePrice());
        System.out.println("Ford year: " + ford.getYear());
        System.out.println("Ford manufacturer discount: " + ford.getManufacturerDiscount());
    }
}

  }
}
