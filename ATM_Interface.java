import java.util.Scanner;
class BankAccount {
     private float balance;

    public BankAccount(float balance) {
        this.balance=balance;
    }
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance=balance;
    }
}
public class ATM {
    private BankAccount account;
    public ATM(BankAccount account) {
        this.account=account;
    }
    public void menu()
    {
        System.out.println(" \n1.WithDraw \n2.deposit \n3.check Balance \n4.Exit");
    }

    public void withDraw(float amount)
    {
        if(amount>account.getBalance()) {
            System.out.println("WithDraw failed...!");
            return;
        }
        account.setBalance(account.getBalance()-amount);
        System.out.println("WithDraw SuccessFull.");
    }

    public void deposite(float amount)
    {
        account.setBalance(account.getBalance()+amount);
        System.out.println("Deposite Successful.");
    }

    public void checkBalance()
    {
        System.out.println("Current Balance : "+account.getBalance());
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        ATM atm = new ATM(account);
        Scanner sc = new Scanner(System.in);

        while (true) {
            atm.menu();

            System.out.print("enter your choice : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("enter Amount to withDraw : ");
                    float withDrawAmt = sc.nextFloat();
                    atm.withDraw(withDrawAmt);
                    break;

                case 2:
                    System.out.println("enter Amount to Deposite : ");
                    float depositeAmt = sc.nextFloat();
                    atm.deposite(depositeAmt);
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("thank you for using the ATM..");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.Please try again..");
            }
        }
    }
    }