import java.util.ArrayList;

public class Company {

    String name;


    public static ArrayList<Company> companyList = new ArrayList<>();
    public ArrayList<Double> valueList = new ArrayList<>();
    public ArrayList<Double> sma10 = new ArrayList<>();
    public ArrayList<Double> sma50 = new ArrayList<>();
    public double volatileValue;

    Company(String name){
        this.name = name;
        companyList.add(this);
    }
    public void addValue(Double value){
        valueList.add(value);
        update();
    }

    private void setSma10() {
        this.sma10 = sma10;
    }

    private void setSma50() {
        this.sma50 = sma50;
    }

    private void setVolatileValue() {
        this.volatileValue = volatileValue;
    }

    public void update(){
        setSma10();
        setSma50();
        setVolatileValue();
    }


}
