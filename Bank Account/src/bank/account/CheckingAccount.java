package bank.account;

public class CheckingAccount extends Account
{
    static double fee = 1.35;
    
    CheckingAccount(double initialBalance)
    {
        super(initialBalance);
                
    }
    
    @Override
    public boolean credit()
    {
        if(creditSuccess = true)
        {
            currentBalance = getAccountBalance() - fee;
        }
        return creditSuccess;        
    }
    
    @Override
    public boolean debit()
    {
        if(debitSuccess = true)
        {
            currentBalance = getAccountBalance() - fee;
        }
        return debitSuccess;
    }
}
