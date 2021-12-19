import Bank.ATM;
import Bank.BankOffice;
import People.Cashier;
import People.Manager;
import Services.Credit.Hypothec;

public class MyBankApp {

    public static void main(String[] args) {

        Hypothec creditDlyaPeti = new Hypothec();
        creditDlyaPeti.getACreditHolidays();

        Manager A = new Manager();
        A.checkFirstName();
        A.checkBalanceOfDebt (creditDlyaPeti);
        A.checkPosition();

        Cashier B = new Cashier();
        B.checkPosition();

        BankOffice moshennikBank = new BankOffice();
        moshennikBank.setBankomat(new ATM());

        ATM Bankomat = moshennikBank.getBankomat();
        int myMoney = Bankomat.getMoney();
        System.out.println(myMoney);


    }


}
