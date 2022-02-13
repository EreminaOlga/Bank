package services;

import bank.ATM;
import bank.BankOffice;

public class ClientBankService extends BankService {
    private CreditService creditService;

    public ClientBankService () {
        creditService = new CreditService();
    }

    public void hypothecPayment() {
        int myBalance = 63759;
        int monthlyPayment = 10000;

        System.out.println(myBalance);

        sendMoneyToMom();

        creditService.creditDecision(myBalance);

        printBalanceAfterPayments(myBalance, monthlyPayment);
    }

    private void printBalanceAfterPayments(int myBalance, int monthlyPayment) {
        while (myBalance > 10000){
            myBalance = myBalance - monthlyPayment;
            System.out.println(myBalance);
        }
    }

    private void sendMoneyToMom() {
        BankOffice sberNaSkhodne = new BankOffice();
        ATM ATM = sberNaSkhodne.getAtm( "перевод денег");
        int myMoney2 = 100;
        int momsAccount = 654348;
        ATM.sendMoney ( myMoney2 + momsAccount);
        momsAccount = momsAccount + myMoney2;
        System.out.println(momsAccount);
    }


}
