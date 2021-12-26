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

        int myBalance = 63759;
        int monthlyPayment = 10000;
        myBalance = myBalance - monthlyPayment;

        System.out.println(myBalance);

        BankOffice sberNaSkhodne = new BankOffice();
            ATM ATM = sberNaSkhodne.getInfo( "перевод денег");
            int myMoney2 = 100;
            int momsAccount = 654348;
            ATM.sendMoney ( myMoney2 + momsAccount);
            momsAccount = momsAccount + myMoney2;
        System.out.println(momsAccount);
    }


}
