package lesson13.store;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.Comparator;

public class Store {

    ArrayList<Product> productList;

    Store(ArrayList<Product> productList) {
        this.productList = productList;
    }


    void add(Product product) {

        if (productList.size() == 0) {
            productList.add(product);
        } else {
            int count = 0;
            for (int i = 0; i < productList.size(); i++) {
                if (product.getId() == productList.get(i).getId()) {
                    count++;
                }
            }
            if(count > 0){
                System.out.println("Нельзя добавить с одинаковыми ID " + product.getName() + " " + product.getId() );
            }else{
                productList.add(product);
            }
        }
    }


    ArrayList<Product> getAll(ArrayList<Product> list) {
        return list;
    }

    void remove(Integer id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                break;
            }
        }
    }

    void redaction(Product product) {
        productList.set(0, product);
    }

    void show() {
        System.out.println("Список товаров:");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }


}

class ComparatorByPrice implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Product) o1).getPrice() - ((Product) o2).getPrice();
    }
}

class ComparatorById implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Product) o2).getId() - ((Product) o1).getId();
    }
}


