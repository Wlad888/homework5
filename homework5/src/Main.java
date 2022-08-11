public class Main {
    public static void main(String[] args) {
        Auto car = new Auto();
        car.printInfo();
        Auto car1 = new Auto ("Mercedes", 60000, 220);
        car1.printInfo();
        Auto car2 = new Auto(car);
        car2.printInfo();
        Auto car3 = new Auto ("Opel", 6000, 90);
        car3.printInfo();
        System.out.println(car3.checkSpeed());

    }
}
