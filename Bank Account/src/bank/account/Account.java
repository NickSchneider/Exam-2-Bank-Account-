package bank.account;

public class Account 
{
    private double accountBalance;
    double currentBalance;

    boolean creditSuccess;
    boolean debitSuccess = false;
    
    Account(double initialBalance)
    {
        if(initialBalance < 0.0)
        {
            System.out.println("Initial balnce must be greater than or equal to zero");
        }
        if(initialBalance > 0.0)
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
    
    public boolean credit(double deposit)
    {
        currentBalance = getAccountBalance() + deposit;
        setAccountBalance();
        return creditSuccess = true;
    }
    
    public boolean debit(double withdrawl)
    {
        if(withdrawl > accountBalance)
        {
            System.out.println("Debit amount exceeded account balance");
        }
        else
        {
            currentBalance = getAccountBalance() - withdrawl;
            setAccountBalance();
        }
        return debitSuccess = true;
    }
    
    
    
}
