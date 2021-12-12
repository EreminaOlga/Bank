package Services.Credit;

public class Hypothec extends Credit {

    private String creditHolidays;

    void buyAnApartment () {
        System.out.println("Квартира куплена");
    }

    public void getACreditHolidays(){
        System.out.println("Кредитные каникулы");
    }

    public double checkBalanceOfDebt() {
        System.out.println("Задолженность составляет:" + 12748);
        return 12748;
    }
}
