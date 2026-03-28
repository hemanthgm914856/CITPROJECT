public class Phone{
    String brand="Apple";
    String model="iPhone 17 Pro Max";
    String color = "Orange";
    void call(){
        System.out.println("Calling...");
    }
    void message (){
        System.out.println("Messaging...");
    }
    public static void main(String[] args) {
        Phone p1 = new Phone();
        System.out.println("Brand: "+p1.brand);
        System.out.println("Model: "+p1.model);
        System.out.println("Color: "+p1.color);
        p1.call();
    }
}