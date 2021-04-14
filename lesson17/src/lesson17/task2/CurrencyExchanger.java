package lesson17.task2;

import java.util.ArrayList;

public class CurrencyExchanger {
    private int id;
    private String USD_rate;
    private String EUR_rate;
    private int amountOfUSD = 1000;
    private int amountOfEUR = 1000;
    private final static int AMOUNT_OF_CUSTOMERS = 1;

    CurrencyExchanger(){
    }

    CurrencyExchanger(int id){
        this.id = id;
    }

    public CurrencyExchanger(int id, String USD_rate, String EUR_rate, int amountOfUSD, int amountOfEUR) {
        this.id = id;
        this.USD_rate = USD_rate;
        this.EUR_rate = EUR_rate;
        this.amountOfUSD = amountOfUSD;
        this.amountOfEUR = amountOfEUR;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUSD_rate() {
        return USD_rate;
    }

    public void setUSD_rate(String USD_rate) {
        this.USD_rate = USD_rate;
    }

    public String getEUR_rate() {
        return EUR_rate;
    }

    public void setEUR_rate(String EUR_rate) {
        this.EUR_rate = EUR_rate;
    }

    public int getAmountOfUSD() {
        return amountOfUSD;
    }

    public void setAmountOfUSD(int amountOfUSD) {
        this.amountOfUSD = amountOfUSD;
    }

    public int getAmountOfEUR() {
        return amountOfEUR;
    }

    public void setAmountOfEUR(int amountOfEUR) {
        this.amountOfEUR = amountOfEUR;
    }

    @Override
    public String toString() {
        return "CurrencyExchanger{" +
                "USD_rate='" + USD_rate + '\'' +
                ", EUR_rate='" + EUR_rate + '\'' +
                ", amountOfUSD=" + amountOfUSD +
                ", amountOfEUR=" + amountOfEUR +
                '}';
    }

    public static ArrayList<CurrencyExchanger> generateCurrencyExchanger(){

        ArrayList<CurrencyExchanger> list = new ArrayList<>();
        for (int i = 0; i <8 ; i++) {
            CurrencyExchanger c = new CurrencyExchanger(i);
            list.add(c);
        }

        for (int i = 0; i < 8; i++) {
            DOMXMLParser.getAllFromXML(list.get(i));
        }
        return list;
    }
}
