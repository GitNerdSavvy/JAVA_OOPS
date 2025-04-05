import java.util.*;

class Money
{
    float Balance;
    int pin;
public void checkPin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Pin: ");
        int p = sc.nextInt();
        if (p == pin)
        {
            menu();
        }
        else
        {
            System.out.println("Invalid Pin");
            checkPin();
        }
    }
public void menu()
    {
        System.out.println("Enter your choice");
        System.out.println("1: Check Balance");
        System.out.println("2: Deposit Money");
        System.out.println("3: Withdraw Money");
        System.out.println("4: Exit");
        Scanner sc=new Scanner(System.in);
        int option = sc.nextInt();
        switch (option)
        {
        case 1:
            checkBalance();
            break;
        case 2:
            Deposit();
            break;
        case 3:
            Withdraw();
            break;
        case 4:
            exit();
            break;
        default:
            System.out.println("Invalid Option");
        }
    }
    public void checkBalance()
        {
            System.out.println("Balance: " + Balance);
            menu();
        }
    public void Deposit()
        {
            System.out.print("Enter Amount: ");
            Scanner sc = new Scanner(System.in);
            float amt = sc.nextFloat();
            Balance = Balance + amt;
            System.out.println("Money Deposited Successfully");
            checkBalance();
        }
    public void Withdraw()
        {
            System.out.print("Enter Amount: ");
            Scanner sc = new Scanner(System.in);
            float amt = sc.nextFloat();
            if(amt<=Balance){

            Balance = Balance - amt;
            System.out.println("Money Withdrawl Successfully");
            checkBalance();
            }else{
                System.out.println("Insufficient Balance");
                checkBalance();
            }
        }
    public void exit()
        {
            return;
        }
    
}

public class Atm
{
public static void main(String[] args)
    {
        Money user1 = new Money();
        user1.pin=3812;
        user1.checkPin();
    }
}