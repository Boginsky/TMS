package lesson17.task2;

import lesson17.task1.Visitor;

import java.util.ArrayList;
import java.util.Random;

public class Customer implements Runnable {
    private String name;
    private ArrayList<CurrencyExchanger> currencyExchangers;
    private ShoppingCenter shoppingCenter;


    public Customer(String name, ShoppingCenter shoppingCenter) {
        this.name = name;
        this.shoppingCenter = shoppingCenter;
        currencyExchangers = new ArrayList<>();

    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                switch (i) {
                    case 0:
                        System.out.println("Customer " + this.name + " at home");
                        Thread.sleep(5000);
                        break;
                    case 1:
                        System.out.println(Customer.this.getName() + " entered the shopping center");
                        Thread.sleep(2000);
                        break;
                    case 2:
                        shoppingCenter.buy(Customer.this,
                                shoppingCenter.getCurrencyExchangers().get(new Random().nextInt(shoppingCenter.getCurrencyExchangers().size())),
                                new Random().nextInt(500));
                        Thread.sleep(2000);
                        break;
                    case 3:
                        shoppingCenter.sale(Customer.this,
                                shoppingCenter.getCurrencyExchangers().get(new Random().nextInt(shoppingCenter.getCurrencyExchangers().size())),
                                new Random().nextInt(500));
                        Thread.sleep(2000);
                        break;
                    case 4:
                        System.out.println(Customer.this.getName() + " returned home");
                        break;
                    case 5:
                        System.out.println("Конец работы потока: " + Thread.currentThread().getName());
                        break;
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
