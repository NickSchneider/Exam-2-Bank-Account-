package bank.account;

public class Account 
{
    private double accountBalance;
    double currentBalance;
    double withdrawl;
    double deposit;
    boolean creditSuccess;
    boolean debitSuccess = false;
    
    Account(double initialBalance)
    {
        if(initialBalance < 0)
        {
            System.out.println("Initial balnce must be greater than or equal to zero");
        }
        else
        {
            accountBalance = initialBalance;
        }
    }

    public void setAccountBalance()
    {
        accountBalance = currentBalance;
    }
    
    public double getAccountBalance() 
    {
        return accountBalance;
    }
    
    public boolean credit()
    {
        accountBalance += deposit;
        return creditSuccess = true;
    }
    
    public boolean debit()
    {
        if(withdrawl > accountBalance)
        {
            System.out.println("Debit amount exceeded account balance");
        }
        else
        {
            accountBalance -= withdrawl;
        }
        return debitSuccess = true;
    }
    
    
    
}
