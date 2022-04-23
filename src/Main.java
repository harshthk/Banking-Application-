import java.util.Scanner;
class bankDetails{
    // Here the keyword are define as a private
    private String accountNumber;
    private String name;
    private String acc_type;
    private long balance;
    private long pin;
    private long bankpassword;
    Scanner scan = new Scanner(System.in);

    // method for set and get bank password
    public void setBankpassword(long bankpassword) {
        this.bankpassword = bankpassword;
    }

    public long getBankpassword() {
        return bankpassword;
    }
    // method for set pin
    public void setPin(long pin){
         this.pin = pin;
    }
//    public long getPin(){
//        return pin;
//    }
    //method to set balance
    public void setBalance(long balance){
        this.balance = balance;
    }

//    public long getBalance() {
//        return balance;
//    }
    //method to set account number
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
//    public String getAccountNumber(){
//        return accountNumber;
//    }
    // method to set acount type
    public void setAcc_type(String acc_type){
        this.acc_type = acc_type;
    }
//    public String getAcc_type(){
//        return acc_type;
//    }
    //method to set name
    public void setName(String name){
        this.name = name;
    }
//    public String getName(){
//        return name;
//    }
    // method to show acount detail
    public void ShowAccountDetails(){
        System.out.println("Name of acount holder:- "+name);
        System.out.println("Your account number:- "+accountNumber);
        System.out.println("Your account type:- "+acc_type);
        System.out.println("Your account balance:- "+balance);
    }
    // method for withdraw
    public long withdraw(){
        long amount;
        System.out.print("Enter the amount you have to withdraw:- ");
        amount = scan.nextLong();
        if(balance > amount){
            balance = balance - amount;
        }else{
            System.out.println("You enter the amount more then your balance.");
        }
        return balance;
    }
    // method for deposit
    public long depositamount(){
        long amount;
        System.out.print("Enter the amount you have to deposit:- ");
        amount = scan.nextLong();
        balance = balance+amount;
        return balance;
    }
    // method for balance query
    public long balanceenquery(){
        System.out.println(balance);
        return balance;
    }
    //method for interest count of annum
    public long interestCount(){
        System.out.print("Enter the amount to know the annual interest:- ");
        long interestAmount = scan.nextLong();
        long finalAmount = (interestAmount*6)/100;
        System.out.println("You will get "+finalAmount+" rs as your annual interest on " + interestAmount );
        return finalAmount;
    }
    //method for pin change
    public long pinchange(){
        System.out.print("Enter the new pin number to replace old:- ");
        //swap
        long newpin = scan.nextLong();
        long temp = pin;
        pin = newpin;
        newpin = temp;
        System.out.println("Your pin had change sucessfully.");
        System.out.println("Your new update pin is "+ pin);
        System.out.println("Your last pin is " + newpin);
        return pin;
    }
    // constructor made for bank details
    bankDetails(String name,String acc_type,String accountNumber,long balance,long pin, long bankpassword){
        this.setName(name);
        this.setAcc_type(acc_type);
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
        this.setPin(pin);
        this.setBankpassword(bankpassword);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankDetails bd1 = new bankDetails("Harsh","saving","8866",5000000,4444,1111); // details are define through constructor
        bankDetails bd2 = new bankDetails("Vanshika","saving","9870",1500000,1111,2222); // details are define through constructor
        bankDetails bd3 = new bankDetails("Sunny","saving","9687",1000000,2222,3333); // details are define through constructor
        bankDetails bd4 = new bankDetails("Vansu","saving","9377",6000000,3333,4444); // details are define through constructor
        System.out.println("Bank Application made by harsh.");
        System.out.print("Enter the password:- ");
        int password = sc.nextInt();
        if (bd1.getBankpassword() == password){
            int choice;
            do {
                Scanner scan = new Scanner(System.in);
                System.out.println(" 1. Display all account details \n 2. Balance enquiry \n 3. Deposit the amount \n 4. Withdraw the amount \n 5. Know the interest amount \n 6. Pin change \n 7. Exit");
                System.out.print("Enter your choice:- ");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        bd1.ShowAccountDetails();
                        break;
                    case 2:
                        bd1.balanceenquery();
                        break;
                    case 3:
                        bd1.depositamount();
                        break;
                    case 4:
                        bd1.withdraw();
                        break;
                    case 5:
                        bd1.interestCount();
                        break;
                    case 6:
                        bd1.pinchange();
                        break;
                    case 7:
                        System.out.println(" Thank you for using our service. \n Have a great day.");
                        break;
                    default:
                        System.out.println(" Oops you enter the wrong choice. \n Enter your choice from above.");
                        break;
                }
            }
            while(choice != 7);
        }
        if (bd2.getBankpassword() == password){
            int choice;
            do {
                Scanner scan = new Scanner(System.in);
                System.out.println(" 1. Display all account details \n 2. Balance enquiry \n 3. Deposit the amount \n 4. Withdraw the amount \n 5. Know the interest amount \n 6. Pin change \n 7. Exit");
                System.out.print("Enter your choice:- ");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        bd2.ShowAccountDetails();
                        break;
                    case 2:
                        bd2.balanceenquery();
                        break;
                    case 3:
                        bd2.depositamount();
                        break;
                    case 4:
                        bd2.withdraw();
                        break;
                    case 5:
                        bd2.interestCount();
                        break;
                    case 6:
                        bd2.pinchange();
                        break;
                    case 7:
                        System.out.println(" Thank you for using our service. \n Have a great day.");
                        break;
                    default:
                        System.out.println(" Oops you enter the wrong choice. \n Enter your choice from above.");
                        break;
                }
            }
            while(choice != 7);
        }
        if (bd3.getBankpassword() == password){
            int choice;
            do {
                Scanner scan = new Scanner(System.in);
                System.out.println(" 1. Display all account details \n 2. Balance enquiry \n 3. Deposit the amount \n 4. Withdraw the amount \n 5. Know the interest amount \n 6. Pin change \n 7. Exit");
                System.out.print("Enter your choice:- ");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        bd3.ShowAccountDetails();
                        break;
                    case 2:
                        bd3.balanceenquery();
                        break;
                    case 3:
                        bd3.depositamount();
                        break;
                    case 4:
                        bd3.withdraw();
                        break;
                    case 5:
                        bd3.interestCount();
                        break;
                    case 6:
                        bd3.pinchange();
                        break;
                    case 7:
                        System.out.println(" Thank you for using our service. \n Have a great day.");
                        break;
                    default:
                        System.out.println(" Oops you enter the wrong choice. \n Enter your choice from above.");
                        break;
                }
            }
            while(choice != 7);
        }
        if (bd4.getBankpassword() == password){
            int choice;
            do {
                Scanner scan = new Scanner(System.in);
                System.out.println("Bank Application made by harsh.");
                System.out.println(" 1. Display all account details \n 2. Balance enquiry \n 3. Deposit the amount \n 4. Withdraw the amount \n 5. Know the interest amount \n 6. Pin change \n 7. Exit");
                System.out.print("Enter your choice:- ");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        bd4.ShowAccountDetails();
                        break;
                    case 2:
                        bd4.balanceenquery();
                        break;
                    case 3:
                        bd4.depositamount();
                        break;
                    case 4:
                        bd4.withdraw();
                        break;
                    case 5:
                        bd4.interestCount();
                        break;
                    case 6:
                        bd4.pinchange();
                        break;
                    case 7:
                        System.out.println(" Thank you for using our service. \n Have a great day.");
                        break;
                    default:
                        System.out.println(" Oops you enter the wrong choice. \n Enter your choice from above.");
                        break;
                }
            }
            while(choice != 7);
        }
    }
}