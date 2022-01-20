import Bank.ATM;
import Bank.BankOffice;
import People.Cashier;
import People.Manager;
import Services.Credit.Credit;
import Services.Credit.Hypothec;

import javax.xml.namespace.QName;

public class MyBankApp {

    public static void main(String[] args) {

        Hypothec creditDlyaKlient = new Hypothec("1");
        creditDlyaKlient.getACreditHolidays();

        Manager A = new Manager();
        A.checkFirstName();
        A.checkBalanceOfDebt (creditDlyaKlient);
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

        System.out.println(myBalance);

        BankOffice sberNaSkhodne = new BankOffice();
            ATM ATM = sberNaSkhodne.getInfo( "перевод денег");
            int myMoney2 = 100;
            int momsAccount = 654348;
            ATM.sendMoney ( myMoney2 + momsAccount);
            momsAccount = momsAccount + myMoney2;
        System.out.println(momsAccount);

        String s = myBalance > 50000 ? "оплатить месячный платеж по ипотеке" : "взять кредитные каникулы";
        System.out.println(s);

        if (clientHasCredit())
            System.out.println("Выдача кредита не одобрена");
        else if (clientHasMatCapital())
            System.out.println("Выдача кредита на основе мат капитала");
        else
            System.out.println("заявка на кредит одобрена");

        while (myBalance > 10000){
            myBalance = myBalance - monthlyPayment ;
            System.out.println(myBalance);
        }

        int clientsInBank = 0;
        do {
            clientsInBank++;
            System.out.println(clientsInBank);
        } while (clientsInBank < 20);

        for (int window = 0; window < 4; window++){
            for (int clientsInLine = 0; clientsInLine < 16; clientsInLine++)
            System.out.println("Окно: " + window + ", номер в очереди: " + clientsInLine);
        }

        Credit CredityDlyaKlientov[] = {new Credit("Кредит"), new Credit("Ипотека"), new Credit("Автокредит")};

        for(Credit credit : CredityDlyaKlientov){
            System.out.println(credit.toString());
        }
        CredityDlyaKlientov[1] = new Credit("Ипотека на новостройку");

        for(Credit credit : CredityDlyaKlientov){
            System.out.println(credit.toString());
        }

    }

    private static boolean clientHasMatCapital() {
        return true;
    }

    private static boolean clientHasCredit() {
        return false;
    }


}
