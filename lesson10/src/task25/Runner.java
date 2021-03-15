package task25;

public class Runner {

    public static void main(String[] args) {

        ATM example = new ATM(20,10,100);

        System.out.println(example.amountOf_20);
        example.add_20(10);
        System.out.println(example.amountOf_20);

        System.out.println(" ");

        System.out.println(example.cashWithdrawal(150));




    }

}
