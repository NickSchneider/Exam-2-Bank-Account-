package bank.account;

public class SavingsAccount extends Account
{
    static double interest = .0008;
        
    SavingsAccount(double initialBalance)
    {
        super(initialBalance);   
        calculateInterest();
    }
    
    public double calculateInterest()
    {
        interest = getAccountBalance() * .0008;
        return interest;
    }
}
