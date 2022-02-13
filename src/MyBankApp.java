import bank.ATM;
import bank.Builder;
import people.Cashier;
import people.Manager;
import services.*;

public class MyBankApp {

    public static void main(String[] args) {

        Manager manager = Builder.buildManager();

        Cashier cashier = Builder.buildCashier();

        ATM atm = Builder.buildBankomat();

        ClientBankService myBankService = new ClientBankService();

        myBankService.hypothecPayment();

        myBankService.calculateBankClients();

        myBankService.calculateClientsInQ();

    }






}
