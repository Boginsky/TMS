package lesson13.store;

import java.util.Objects;

public class Product {

    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public String toString() {
        return "Id товара: " + this.id + " , имя товара: " + this.name + " , цена товара: " + this.price +".";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
