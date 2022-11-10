class Car {
    String brand;

    Car(String s) {
        this.brand = s;
    }

    public void getBrand() {
        System.out.println("The name of the brand is " + brand);
    }

    public static void main(String[] args) {
        Car ob = new Car("Ford");
        ob.getBrand();
    }
}