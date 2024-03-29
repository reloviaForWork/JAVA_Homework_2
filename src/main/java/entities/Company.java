package entities;

public class Company extends Customer {
    private String CompanyName;
    private String TaxNumber;

    public Company() {

    }
    public Company(String companyName, String taxNumber) {
        this.CompanyName = companyName;
        this.TaxNumber = taxNumber;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getTaxNumber() {
        return TaxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        TaxNumber = taxNumber;
    }
}
