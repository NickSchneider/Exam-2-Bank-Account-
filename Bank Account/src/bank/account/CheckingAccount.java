package bank.account;

public class CheckingAccount extends Account
{
    static double fee = 1.35;
    
    CheckingAccount(double initialBalance)
    {
        super(initialBalance);                
    }
    
    @Override
    public boolean credit(double deposit)
    {
        if(creditSuccess = true)
        {
            currentBalance = getAccountBalance() - fee;
            setAccountBalance();
        }
        return creditSuccess;        
    }
    
    @Override
    public boolean debit(double withdrawl)
    {
        if(debitSuccess = true)
        {
            currentBalance = getAccountBalance() - fee;
            setAccountBalance();
        }
        return debitSuccess;
    }
}
