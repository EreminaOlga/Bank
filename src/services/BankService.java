package services;

import bank.ATM;
import bank.BankOffice;

public class BankService {

    public void calculateClientsInQ() {
        for (int window = 0; window < 4; window++){
            for (int clientsInLine = 0; clientsInLine < 16; clientsInLine++)
                System.out.println("Окно: " + window + ", номер в очереди: " + clientsInLine);
        }
    }

    public void calculateBankClients() {
        int clientsInBank = 0;
        do {
            clientsInBank++;
            System.out.println(clientsInBank);
        } while (clientsInBank < 20);
    }
}
