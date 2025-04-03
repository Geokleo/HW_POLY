import taxes.*;
import deals.*;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        Company intel = new Company("intel", new TaxSystem());
        intel.setTaxSystem(new TaxSystemUSNDebitMinusCredit());
        intel.shiftMoney(400);
        intel.shiftMoney(600);
        intel.shiftMoney(-100);
        intel.payTaxes();

        Company amd = new Company("amd", new TaxSystem());
        amd.setTaxSystem(new TaxSystemUSNDebit());
        amd.shiftMoney(700);
        amd.shiftMoney(1100);
        amd.shiftMoney(-2000);
        amd.payTaxes();

        //Задание 2 (необязательное)
        System.out.println();
        Deal[] deals = {
                new Sale("Sale Intel Xeon", 400, "Xeon"),
                new Sale("Sale Intel i7", 600, "i7"),
                new Expenditure("Expenditure Copper Ore", 100, "Copper Ore")
        };
        System.out.println("Разница доходов и расходов, которая была на момент старта уплаты налогов: " + intel.applyDeals(deals));
    }
}