package bank;

import bank.ATM;
import bank.BankOffice;
import people.Cashier;
import people.Manager;
import services.Hypothec;

public class Builder {
    public static BankOffice buildBank() {
        BankOffice moshennikBank = new BankOffice();
        moshennikBank.setBankomat(new ATM());
        return moshennikBank;
    }

    public static Cashier buildCashier() {
        Cashier cashier = new Cashier();
        cashier.checkPosition();
        return cashier;
    }

    public static Manager buildManager() {
        Manager manager = new Manager();
        manager.checkFirstName();
        manager.checkBalanceOfDebt (builgHypothec());
        manager.checkPosition();
        return manager;
    }

    public static Hypothec builgHypothec() {
        Hypothec creditDlyaKlient = new Hypothec("1");
        creditDlyaKlient.getACreditHolidays();
        return creditDlyaKlient;
    }
    public static ATM buildBankomat() {
        ATM bankomat = buildBank().getBankomat();
        int myMoney = bankomat.getMoney();
        System.out.println(myMoney);
        return bankomat;
    }
}
