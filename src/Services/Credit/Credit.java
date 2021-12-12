package Services.Credit;

import Services.Services;

public class Credit extends Services {

    String target;//цель
    double procent;
    String contract; //договор
    double monthlyPayment; //ежемесячный платеж
    double term; //срок
    String preferentialTerms; //льготные условия
    private double balanceOfDebt; //остаток задолженности

    public void getACredit(){
        System.out.println("Кредит оформлен");
    }

    public void makeAMonthlyPayment(){
        System.out.println("Внесен ежемесячный платеж");
    }

    public void getACreditApproval(){ //получить одобрение кредита
        System.out.println("Выдача кредита одобрена");
    }

    public double checkBalanceOfDebt(){
        System.out.println("Задолженность составляет:" + balanceOfDebt);
        return balanceOfDebt;
    }

    public void getRefinancing(){
    }
}
