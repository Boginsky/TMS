package lesson13.store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        Store store = new Store(new ArrayList<Product>());

        Product crisps = new Product(10, "Crisps", 150);
        Product iceCream = new Product(11, "Ice Cream", 180);
        Product biscuits = new Product(15, "Biscuits", 280);
        Product apples = new Product(16, "Apple", 70);
        Product water = new Product(22, "Water", 20);
        Product milk = new Product(22, "Milk", 22);

        store.add(crisps);
        store.add(iceCream);
        store.add(biscuits);
        store.add(apples);
        store.add(water);
        store.add(milk);


        System.out.println("");
        System.out.println("СПИСОК ПЕРЕД ПЕРВОЙ СОРТИРОВКОЙ:");
        store.show();
        Collections.sort(store.productList,new ComparatorByPrice());
        System.out.println("");
        System.out.println("СПИСОК ПОСЛЕ ПЕРВОЙ СОРТИРОВКИ:");
        store.show();
        store.remove(15);
        System.out.println("");
        System.out.println("СПИСОК ПОСЛЕ УДАЛЕНИЯ ОБЪЕКТА:");
        Collections.sort(store.productList, new ComparatorById());
        store.show();
        store.redaction(new Product(25,"Chocolate",100));
        System.out.println("");
        System.out.println("СПИСОК ПОСЛЕ РЕДАКТИРОВАНИЯ ПЕРВОГО ОБЪЕКТА");
        store.show();



    }

}


