

public class Auto {
    String name;
    int price;
    int speed;

    Auto() {
        name = "Porsche";
        price = 120000;
        speed = 330;
    }

    Auto(String name, int price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    Auto(Auto a) {
        this.name = a.name;
        this.price = a.price;
        this.speed = a.speed;
    }


    void printInfo() {
        String info = "Brand name: " + name + "; " + "Price: " + price + " EUR" + "; " + "Speed: " + speed + " Km/h.";
        System.out.println(info);
    }

    void checkSpeed(Auto car) {
        if (this.speed > 100) {
            System.out.println(car.name + " true");
        } else if (this.speed < 100) {
            System.out.println(car.name + "false");
        } else {
            System.out.println(car.name + " has the same speed as " + 100);
        }
    }
}



