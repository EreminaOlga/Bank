package People;

import Services.Credit.Hypothec;

public class Manager extends LeadManager {

    public void checkFirstName() {
        System.out.println("Я менеджер Алексей");
    }

    public void checkPosition(){
        System.out.println("Должность: менеджер");
    }

   public void checkBalanceOfDebt (Hypothec creditDlyaPeti){
        creditDlyaPeti.checkBalanceOfDebt();
    }

}
