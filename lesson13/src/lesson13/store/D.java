package lesson13.store;

import java.util.ArrayList;

public class D {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Product1 milk = new Product1(22);
        Product1 milk1 = new Product1(22);
        System.out.println(milk.getId() == milk1.getId());

    }
}
class Product1 {
    int id;

    Product1(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
