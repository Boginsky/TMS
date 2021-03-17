package lesson15.adiitionaltask4;
//4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
//сериализации произвести обратный процесс

import java.io.*;

public class Car implements Serializable {
    private String brand;
    private int speed;
    private int price;

    public Car(){
    }

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        Car car = new Car("BMW",200,10000);

        File f = new File("E:\\TMS_DEV\\TMS\\lesson15\\src\\lesson15\\adiitionaltask4\\Car.txt");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(f))){
            oos.writeObject(car);
            car = null;
            car = (Car) in.readObject();
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
