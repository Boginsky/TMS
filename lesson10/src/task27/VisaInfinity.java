package task27;

public class VisaInfinity extends VisaGold {

    String insurance;

    VisaInfinity(String color,int maxAmountOfCash,int yearOfOperation,int costOfCard,String currency,String additionalCurrency, int overDraft,String insurance){
        super(color,maxAmountOfCash,yearOfOperation,costOfCard,currency,additionalCurrency,overDraft);
        this.insurance = insurance;
    }




}
