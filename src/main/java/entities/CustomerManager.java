package entities;

public class CustomerManager {
    private Person _person;
    private ICreditManager _creditManager;
    public CustomerManager(Person person, ICreditManager creditManager) {
        this._person = person;
        this._creditManager = creditManager;
    }
    public void save() {
        System.out.println("Müşteri kaydedildi: " + _person.getFirstName());
    }

    public void delete() {
        System.out.println("Müşteri silindi: " + _person.getFirstName());
    }
    public void giveCredit() {
        _creditManager.calculate();
        System.out.println("Kredi verildi...");
    }
}
