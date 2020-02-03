public class Account {
    private int id = 0;
    protected double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated = new Date();
    public Account(){}
    public Account(int identity, double iniBal){
        this.id = identity;
        this.balance = iniBal;
        //this. annualInterestRate = intRate;
    }
    //A mutator/Accessor
    public int getId(){
        return this.id;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getInterestRate(){
        return this.annualInterestRate;
    }

    public Date getDate(){
        return this.dateCreated;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }

    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }

    public void withdraw(double amount){
    	if(amount < this.balance) {
        balance -= amount;
    	}else {
    		System.out.print("Insufficient fund!");
    	}
    }

    public void deposit(double amount){
         balance += amount;
    }

    public void setId(int i){
        this.id = i;
    }

    public void setBalance(double bal){
        this.balance = bal;
    }

    public void setAnnualInterestRate(double intR){
        this.annualInterestRate = intR;
    }
    public String toString() {
    	return "\nAccount\n" +
    	        "ID: " + getId() +
    	        "\nBalance: " + getBalance() +
    	        "\ndateCreated: " + getDate();
    	        

    		}
    public static void main(String[] args){
        Account a = new Account(1122, 20000);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500.0);
        a.deposit(3000.0);
        System.out.println("Current Balance: $" + a.getBalance());
        System.out.println("Monthly Interest: " + a.getMonthlyInterest());
        System.out.println("Date created: " + a.getDate());

    }
}
