public class WaterBill {
    
    //member variables
    private int accountNumber;
    private double waterUsage;
    private double monthlyBill;
    
    //default constructor
    public WaterBill(){}
    
    //normal constructor
    public WaterBill(int accountNumber, double waterUsage){
        this.accountNumber = accountNumber;
        this.waterUsage = waterUsage;
    }
    
    //getter
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public double getWaterUsage(){
        return waterUsage;
    }
    
    public double getMonthlyBill(){
        return monthlyBill;
    }
   
    //setter
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public void setWaterUsage(double waterUsage){
        this.waterUsage = waterUsage;
    }
    
    public void setMonthlyBill(double monthlyBill){
        this.monthlyBill = monthlyBill;
    }
    
    //print
    @Override
    public String toString(){
        return "Account Number: " + accountNumber + "\n" +  "Water Usage: " + waterUsage
               + "\n" + "Monthly Bill: " + "RM " + monthlyBill;
    }
    
    //calc water bill for month
    public void calcWaterBill(double ratePerMeterCube){
        this.monthlyBill = this.waterUsage * ratePerMeterCube;
        
    }
 }
    
