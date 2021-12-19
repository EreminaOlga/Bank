package Bank;

public class BankOffice extends Bank {

    String adress;
    String workSchedule;
    BankDepartment creditDepartment; //отдел кредитования
    BankDepartment departmentOfForeignExchangeTransaction; //отдел валютно-обменных операций

    public ATM getBankomat() {
        return Bankomat;
    }

    public void setBankomat(ATM bankomat) {
        Bankomat = bankomat;
    }

    private ATM Bankomat;

      }

