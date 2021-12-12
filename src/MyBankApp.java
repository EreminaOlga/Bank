import People.Manager;
import Services.Credit.Hypothec;

public class MyBankApp {

    public static void main(String[] args) {

        Hypothec creditDlyaPeti = new Hypothec();
        creditDlyaPeti.getACreditHolidays();

        Manager A = new Manager();
        A.checkFirstName();
        A.checkBalanceOfDebt (creditDlyaPeti);

    }

}
