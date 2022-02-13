package bank;

public class BankOffice extends Bank {

    private String adress;
    private String workSchedule;
    private BankDepartment creditDepartment; //отдел кредитования
    private BankDepartment departmentOfForeignExchangeTransaction; //отдел валютно-обменных операций
    private ATM Bankomat;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(String workSchedule) {
        this.workSchedule = workSchedule;
    }

    public BankDepartment getCreditDepartment() {
        return creditDepartment;
    }

    public void setCreditDepartment(BankDepartment creditDepartment) {
        this.creditDepartment = creditDepartment;
    }

    public BankDepartment getDepartmentOfForeignExchangeTransaction() {
        return departmentOfForeignExchangeTransaction;
    }

    public void setDepartmentOfForeignExchangeTransaction(BankDepartment departmentOfForeignExchangeTransaction) {
        this.departmentOfForeignExchangeTransaction = departmentOfForeignExchangeTransaction;
    }

    public ATM getBankomat() {
        return Bankomat;
    }

    public void setBankomat(ATM bankomat) {
        Bankomat = bankomat;
    }

    public ATM getAtm(String s) {
        if(s.equals("перевод денег"))
            return new ATM();
        return null;
    }

}

