package bank.account;
import java.util.Scanner;
public class Account 
{
    Scanner input =new Scanner(System.in);
    protected double accountBalance = 0;
    double currentBalance;
    double withdrawl;
    double deposit;
    boolean creditSuccess;
    boolean debitSuccess = false;
    String answer = "0";
    
    Account(double accountBalance)
    {
        if(accountBalance < 0.0)
        {
            System.out.println("Initial balnce must be greater than or equal to zero");
        }
        if(accountBalance > 0.0)
        {
            this.accountBalance = accountBalance;
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
        System.out.println("Would you like to make a Deposit? 'Y' or 'N'");
        answer = input.nextLine();
        if(answer.equals("Y"))
        {
            System.out.print("Deposit amount: ");
            deposit = input.nextDouble();
        }
        currentBalance = getAccountBalance() + deposit;
        setAccountBalance();
        return creditSuccess = true;
    }
    
    public boolean debit()
    {
        System.out.println("Would you like to make a withdrawl? 'Y' or 'N'");
        answer = input.nextLine();
        if(answer.equals("Y"))
        {
            System.out.print("Withdrawl amount: ");
            withdrawl = input.nextDouble();
        }
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
