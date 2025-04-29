public class Individual extends TaxPayer{

    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures){
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures(){
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures){
        this.healthExpenditures = healthExpenditures;
    }
    @Override
    public Double tax(){
        if (getAnualIncome() < 2.000){
            return (getAnualIncome() * 0.15) - (getHealthExpenditures() * 0.5) ;
        }   
        else {

           return getAnualIncome() * 0.25 - (getHealthExpenditures() * 0.5);
        }
    }
}