package services;

public class CreditService {
    public void creditDecision(int myBalance) {
        String s = myBalance > 50000 ? "оплатить месячный платеж по ипотеке" : "взять кредитные каникулы";
        System.out.println(s);

        if (clientHasCredit())
            System.out.println("Выдача кредита не одобрена");
        else if (clientHasMatCapital())
            System.out.println("Выдача кредита на основе мат капитала");
        else
            System.out.println("заявка на кредит одобрена");
    }
    private boolean clientHasMatCapital() {
        return true;
    }

    private boolean clientHasCredit() {
        return false;
    }
}
