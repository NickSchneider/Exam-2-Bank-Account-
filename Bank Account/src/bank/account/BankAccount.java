package bank.account;

public class BankAccount 
{
    
    public static void main(String[] args) 
    {      
       Account account = new Account(100000);
       account.credit(56000);       
       account.debit(65000);
       System.out.printf("Current Balance: \n", account.getAccountBalance());
       
       SavingsAccount savings = new SavingsAccount(150000);
       savings.credit(65000);
       savings.debit(56000);
       System.out.printf("Current Balance: \n", savings.getAccountBalance());
       
       CheckingAccount checking = new CheckingAccount(200000);
       checking.credit(56000);
       checking.debit(65000);
       System.out.printf("Current Balance: \n", checking.getAccountBalance());
    }
           
    
}
