import java.util.Scanner;
public class Car {
    String brand;
    String model;
    int speed = 0;

    void accelerate() {
        if (speed <50){
        speed += 5;
        System.out.println(brand +  " "+model+" Accelerating... Current speed: " + speed + " km/h");
    }else
    System.out.println(brand + " "+model+" has reached maximum speed of 50 km/h.");
}

    void brake() {
        if (speed >= 5)
            speed -= 5;
        System.out.println(brand + " "+model+" Breaking... Current speed: " + speed + " km/h");
    }
    void setBrand(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the brand of the car: ");
        brand = sc.nextLine();

    }
    void setModel(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the model of the car: ");
        model = sc.nextLine();

    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand();
        c1.setModel();
        System.out.println("Brand: " + c1.brand);
        System.out.println("Model: " + c1.model);
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();c1.accelerate();
        c1.brake();
        c1.brake();
        c1.brake();
        Car c2 = new Car();
        c2.setBrand();
        c2.setModel();
        System.out.println("Brand: " + c2.brand);
        System.out.println("Model: " + c2.model);
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();
        c2.brake();
        c2.brake();
        c2.brake();
        c2.brake();
        c2.brake();
    }
}