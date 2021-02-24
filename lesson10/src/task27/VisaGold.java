package task27;

public class VisaGold extends VisaClassic {

    String additionalCurrency;
    int overDraft;

    VisaGold(){

    }

    VisaGold(String color,int maxAmountOfCash,int yearOfOperation,int costOfCard,String currency,String additionalCurrency, int overDraft){
        super(color,maxAmountOfCash,yearOfOperation,costOfCard,currency);
        this.additionalCurrency = additionalCurrency;
        this.overDraft = overDraft;
    }

}
