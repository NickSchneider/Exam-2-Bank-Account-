package bank.account;

public class SavingsAccount extends Account
{
    static double interest = .0008;
        
    SavingsAccount(double accountBalance)
    {
        super(accountBalance);   
        calculateInterest();
    }
    
    public double calculateInterest()
    {
        interest = getAccountBalance() * .0008;        
        return interest;
    }
    
    @Override
    public boolean credit()
    {
        currentBalance = getAccountBalance() + interest;
        setAccountBalance();
        return creditSuccess;
    }
}
