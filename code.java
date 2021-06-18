import java.util.Scanner;
public class BankAccount 
{
    private double balance;
    public double addInterest;
    public BankAccount()
    {
        balance = 0;
    }
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    public void withdraw(double amount) 
    {
        balance = balance - amount;
    }
    public double getBalance()
    {
        return balance;
    }
    public void addInterest(double rate) 
    {
        balance += balance * (addInterest/10);
        balance = getBalance();
    }
}
class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccount momsSavings = new BankAccount(1000);
        momsSavings.addInterest(10);
        System.out.println(momsSavings.getBalance());
        System.out.println("Expected: 1100");  
    } 
}
