package entities;

public class CarCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Araç kredisi hesaplandı...");
    }
}
