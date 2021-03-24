package lesson17.task2;

import java.util.ArrayList;

public class ShoppingCenter {
    private ArrayList<CurrencyExchanger> currencyExchangers = CurrencyExchanger.generateCurrencyExchanger();

    synchronized void buy(Customer customer, CurrencyExchanger currencyExchanger, int amount) throws InterruptedException {
        String amountOfBoughtEUR = currencyExchanger.getEUR_rate();
        double amountOfBoughtEUR1 = (Double.parseDouble(amountOfBoughtEUR)) * amount;
        System.out.println("Customer " + customer.getName() + " bought EUR " + amountOfBoughtEUR1 + " at the currency exchanger №" + currencyExchanger.getId());
    }


    synchronized void sale(Customer customer, CurrencyExchanger currencyExchanger, int amount) throws InterruptedException {
        String amountOfBoughtUSD = currencyExchanger.getUSD_rate();
        double amountOfBoughtUSD1 = (Double.parseDouble(amountOfBoughtUSD)) * amount;
        System.out.println("Customer " + customer.getName() + " sold USD " + amountOfBoughtUSD1 + " at the currency exchanger №" + currencyExchanger.getId());
    }


    public ArrayList<CurrencyExchanger> getCurrencyExchangers() {
        return currencyExchangers;
    }

    public void setCurrencyExchangers(ArrayList<CurrencyExchanger> currencyExchangers) {
        this.currencyExchangers = currencyExchangers;
    }
}
