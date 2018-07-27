class Car {
    Car() {
        try {
            throw new Exception();
        } catch (Exception ex) {
            System.out.println("Do Nothing");
        }
    }
}

class CarTest {
    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car();
        Car carThree = carTwo;
        // how many objects have been created? 4?
    }
}