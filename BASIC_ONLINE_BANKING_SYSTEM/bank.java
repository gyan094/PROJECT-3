package BASIC_ONLINE_BANKING_SYSTEM;

import java.util.Scanner;

abstract class customer{
    public String Name="My Bank";
    public String IFSC="MyBank123";
    public void bankDetails() {
        System.out.println("Bank Name :" + Name + "Bank IFSC Code :" + IFSC);
    }
    //password=123
    abstract void Deposite();
    abstract void Withdraw();
    abstract void CheckBalance();
}
class bank_service extends customer {
    private double balances = 5000;
    private int pass;
    public double money;

    public void Deposite() {
        System.out.println("Enter password: ");
        Scanner s = new Scanner(System.in);
        pass = s.nextInt();
        if (pass == 1234) {
            System.out.println("Enter Deposite Amount: ");
            money = s.nextDouble();
            balances = balances + money;
            System.out.println("Deposite Money: " + money);
            System.out.println("Total Balance: " + balances);
        } else {
            System.out.println("Incorrect Password: ");
        }
    }

    public void Withdraw() {
        System.out.println("Enter password: ");
        Scanner s = new Scanner(System.in);
        pass = s.nextInt();
        if (pass == 1234) {
            System.out.println("Enter Withdraw Amount: ");
            money = s.nextDouble();
            balances = balances - money;
            System.out.println("Withdraw Money: " + money);
            System.out.println("Total Balance: " + balances);
        } else {
            System.out.println("Incorrect Password: ");
        }
    }

    public void CheckBalance() {
        System.out.println("Enter password: ");
        Scanner s = new Scanner(System.in);
        pass = s.nextInt();
        if (pass == 1234) {
            System.out.println("Total Balance: " + balances);
        } else {
            System.out.println("Incorrect Password: ");
        }
    }

    class bank {
        public static void main(String[] args)
        {
            bank_service b = new bank_service();
            b.bankDetails();
            System.out.println("1. Deposite :");
            System.out.println("2. Withdraw :");
            System.out.println("3. CheckBalance :");
            System.out.println("\nEnter your choice: ");
            Scanner s2 = new Scanner(System.in);
            int choices = s2.nextInt();
            switch (choices) {
                case 1:
                    b.Deposite();
                    break;
                case 2:
                    b.Withdraw();
                    break;
                case 3:
                    b.CheckBalance();
                    break;
                default:
                    System.out.println("Invalid choice: ");
            }
        }
    }
}
