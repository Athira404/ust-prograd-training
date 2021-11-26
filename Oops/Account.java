import java.util.Objects;
import java.util.Scanner;

class Account{
    private static double balance = 0;
    double amount;
    public static void main(String[] args) {
        System.out.println("****Welcome****");
        transaction();
    }
    public static void withdrawal(double amount){
        if (balance <= 1000 || amount > balance ){
            System.out.println("Insufficient funds to withdraw");
        }
        if (amount < balance){
            balance = balance - amount;
            balance_check();
        }
        else{
            System.out.println("Please enter the valid amount");
            transaction();
        }
    }

    public static void deposit(double amount){
        balance = balance + amount;
        Account.balance_check();
        Account.transaction();
    }
    public static void balance()
    {
        System.out.println("Your current balance is " + balance);
    }
    public static void transaction(){
        System.out.println("Please choose the valid option...");
        System.out.println("Eg : Enter 1 if you want to deposit");
        System.out.println("1.Deposit");
        System.out.println("2.Withdrawal");
        System.out.println("3.Balance Enquiry");
        System.out.println("4. Exit");
        System.out.print("Enter here : ");
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        switch (action) {
            case 1 : {
                System.out.println("Enter the amount to deposit : ");
                double deposit_amount = scanner.nextDouble();
                deposit(deposit_amount);
                break;
            }
            case 2 : {
                System.out.println("Enter the amount to withdraw : ");
                double withdraw_amount = scanner.nextDouble();
                withdrawal(withdraw_amount);
                break;
            }
            case 3 :{
                balance();
                next_transaction();
                break;
            }
            case 4 :
            {
                System.out.println("Thanks for using our service");
                System.out.println("Have a great day..!");
                System.exit(0);
            }
            default :{
                System.out.println("Please enter the valid choice");
                break;
            }
        }
    }
    public static void balance_check(){
        System.out.println("Do you want to check your balance? If yes, Please click yes, else no...");
        Scanner scanner = new Scanner(System.in);
        String balance_check = scanner.nextLine();
        if (balance_check.equals("yes")){
            System.out.println("Your current balance is " + balance);
            next_transaction();
        }
        if (balance_check.equals("no")){
            next_transaction();
        }
        else{
            System.out.println("Please enter the valid option");
            transaction();
        }
    }
    public static void next_transaction(){
        System.out.println("Do you want to continue the transaction?");
        Scanner scanner = new Scanner(System.in);
        String transaction = scanner.nextLine();
        if (transaction.equals("yes")){
            transaction();
        }
        else if (transaction.equals("no")){
            System.out.println("Thanks for using our service...!");
            System.out.println("Have a great day...!");
            System.exit(0);
        }
        else{
            System.out.println("Please enter the valid option");
            transaction();
        }
    }
}

