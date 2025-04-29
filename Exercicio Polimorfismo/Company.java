public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company (String name, Double anualIncome, Integer numberOffEmployees){
        super(name, anualIncome);
        this.numberOfEmployees = numberOffEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax(){
        if (getNumberOfEmployees() > 10){
            return getAnualIncome() * 0.14;
        }   
        else {
            return getAnualIncome() * 0.16;
        }
    }
    
}