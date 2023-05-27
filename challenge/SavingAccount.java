package challenge;


public class SavingAccount {
    private String accountholdername;
    private long accountnumber;
    private String accountopeningdate;
    private String accountstatus;
    private double availablebalance;
    private double totalbalance;
    private boolean isinternetandmobilebanking;
    private float interestrate;
    private String modeofoperation;

    public SavingAccount(){
        this.accountholdername="john";
        this.accountnumber=123456789L;
        this.accountopeningdate="26/08/1993";
        this.accountstatus="active";
        this.availablebalance=45000;
        this.totalbalance=10000;
        this.isinternetandmobilebanking=true;
        this.interestrate=10;
        this.modeofoperation="self";
    }
    public String getAccountholdername(){
        return accountholdername;
    }
    public void setAccountholdername(String accountholdername){
        this.accountholdername=accountholdername;
    }
    public long getAccountnumber(){
        return accountnumber;
    }
    public void setAccountnumber(long accountnumber){
        this.accountnumber=accountnumber;
    }
    public String getAccountopeningdate(){
        return accountopeningdate;
    }
    public void setAccountopeningdate(String accountopeningdate){
        this.accountopeningdate=accountopeningdate;
    }
    public String getAccountstatus(){
        return accountstatus;
    }
    public void setAccountstatus(String accountstatus){
        this.accountstatus=accountstatus;
    }
    public double getAvailablebalance(){
        return availablebalance;
    }
    public void setAvailablebalance(double availablebalance){
        this.availablebalance=availablebalance;
    }
    public double getTotalbalance() {
        return totalbalance;
    }
    public void setTotalbalance(double totalbalance){
        this.totalbalance=totalbalance;
    }
    public boolean isIsinternetandmobilebanking(){
        return isinternetandmobilebanking;
    }
    public void setinternetandmobilebanking(boolean internetandmobilebanking){
        isinternetandmobilebanking=internetandmobilebanking;
    }
    public float getInterestrate(){
        return interestrate;
    }
    public void setInterestrate(float interestrate){
        this.interestrate=interestrate;
    }
    public String getModeofoperation(){
        return modeofoperation;
    }
    public void setModeofoperation(String modeofoperation){
        this.modeofoperation=modeofoperation;
    }
    public double getcheckBalance(){
        return getAvailablebalance();
    }
    public double setCalculatedebitamount(double debitcash){
        availablebalance=getAvailablebalance()-debitcash;
        System.out.println("balance amount debited :"+debitcash);
        return getAvailablebalance();

    }
    public double setCalculatecreditedamount(double creditcash){
        availablebalance=getAvailablebalance()+creditcash;
        System.out.println("balance amount credited :"+creditcash);
        return getAvailablebalance();
    }

    public void Displaydetails(){
        System.out.println("accountholdername  "  +getAccountholdername());
        System.out.println("account number  "  +getAccountnumber());
        System.out.println("account opening date  " +getAccountopeningdate());
        System.out.println("available balance  "  +getAvailablebalance());
        System.out.println("total balance  "  +getTotalbalance());
        System.out.println("account status  "  +getAccountstatus());
        System.out.println("account type  "  +getModeofoperation());
        System.out.println("is internet and mobile banking  "  +isinternetandmobilebanking);
        System.out.println("interest rate  "  +getInterestrate());
    }
}

