package People;

import Services.Credit.Hypothec;

public class Manager extends LeadManager {

    public void checkFirstName() {
        System.out.println("Я менеджер Алексей");
    }

    public void checkBalanceOfDebt(Hypothec creditDlyaPeti) {
        creditDlyaPeti.checkBalanceOfDebt();
    }

}
