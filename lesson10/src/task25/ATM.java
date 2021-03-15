package task25;


//Задание 25
//        Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
//        банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
//        50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
//        снимающую деньги. На вход передается сумма денег. На выход – булевское
//        значение (операция удалась или нет). При снятии денег функция должна
//        рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
//        конструктор с тремя параметрами – количеством купюр.

public class ATM {

    int amountOf_20;
    int amountOf_50;
    int amountOf_100;
    boolean success = false;

    ATM(int amountOf_20, int amountOf_50, int amountOf_100) {
        this.amountOf_20 = amountOf_20;
        this.amountOf_50 = amountOf_50;
        this.amountOf_100 = amountOf_100;
    }


    int add_20(int amountOf_20) {
        return this.amountOf_20 += amountOf_20;
    }

    int add_50(int amountOf_50) {
        return this.amountOf_50 += amountOf_50;
    }

    int add_100(int amountOf_100) {
        return this.amountOf_100 += amountOf_100;
    }

    boolean cashWithdrawal(int cash) {

        int holeAmountOfMoney = this.amountOf_100 * 100 + this.amountOf_50 * 50 + this.amountOf_20 * 20;

        if (holeAmountOfMoney > cash) {
            success = true;
        } else {
            return success;
        }

        int hundred = cash / 100;
        int fifty = (cash - (hundred * 100)) / 50;
        int twenty = (cash - ((hundred * 100) + (fifty * 50))) / 20;


        System.out.println("Сотки: " + hundred + ". " + "Пятидесятки: " + fifty + ". " + "Двадцатки: " + twenty + ".");

        return success;

    }

}
