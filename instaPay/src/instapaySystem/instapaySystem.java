package instapaySystem;

import TransactionManagment.Transaction;
import TransactionManagment.TransactionToBank;
import TransactionManagment.TransactionToInstaAccount;
import TransactionManagment.TransactionToWallet;
import UserAuthentication.*;
import UserData.*;
import BillManagment.*;

import java.util.Scanner;


public class instapaySystem {


    public static void main(String[] args) {

        seeding();

        User user = new BankUser() ;

        
        Scanner scanner = new Scanner(System.in);

        int choice=0 , option=0;
        boolean isLoggedIn = false; // Flag to track if the user is logged in

        do {
            // Display the login menu if the user is not logged in
            if (!isLoggedIn) {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Login Menu:");
                System.out.println("1. Sign up");
                System.out.println("2. Sign in");
                System.out.println("3. Exit");
                System.out.println("Choose an option (1-3): ");
                System.out.println("----------------------------------------------------------------------------------------");
                choice = scanner.nextInt();

            } else {
                // Display the main menu if the user is logged in
                user.loadProfile();
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Main Menu:");
                System.out.println("1. Inquire Balance");
                System.out.println("2. Pay Bill");
                System.out.println("3. Transfer Money");
                System.out.println("4. Logout");
                System.out.println("Choose an option (1-4): ");
                System.out.println("----------------------------------------------------------------------------------------");

                option = scanner.nextInt();
            }

            // Read the user's choice

            // Process the user's choice based on login status
            if (!isLoggedIn) {
                // If not logged in, process login menu choices
                switch (choice) {
                    case 1:
                        user = manageSignup();
                        if(user != null){
                            isLoggedIn = true;
                        }
                        break;
                    case 2:
                        user = manageSignin();
                        if(user !=null){
                            isLoggedIn = true;
                        }
                        break;
                    case 3:
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                }
            } else {
                // If logged in, process main menu choices
                switch (option) {
                    case 1:
                        System.out.println("your balance : " + user.getAccount().inquireBalance());
                        // Add logic for inquiring balance here
                        break;
                    case 2:

                        System.out.println("You chose: Pay Bill");

                        payBill(user);
                        break;
                    case 3:
                        transfer(user);
                        break;
                    case 4:
                        System.out.println("Logging out. Goodbye!");
                        isLoggedIn = false; // Set the flag to false after logout
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                }
            }

        } while (choice != 3); // Continue the loop until the user chooses to exit

        scanner.close();

    }

    public static User manageSignup() {
        Scanner scanner = new Scanner(System.in);

        Registration r;

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Choose the type of registration:");
        System.out.println("1. Bank");
        System.out.println("2. Wallet");
        System.out.println("Enter your choice (1 or 2): ");
        System.out.println("----------------------------------------------------------------------------------------");

        int registrationType = scanner.nextInt();

        User user;
        if (registrationType == 1) {
            r = new BankRegistration();
            user = new BankUser();
            if(r.signUp(user)){
                return user;
            }
            else {
                return null;
            }

        } else if (registrationType == 2) {
            r = new WalletRegistration();
            user = new WalletUser();
            if (r.signUp(user)){
                return user;
            }
            else {
                return null;
            }


        } else {
            System.out.println("Invalid registration type.");
            return null;
        }

    }

    public static User manageSignin(){
        Scanner in = new Scanner(System.in);
        String username , password;
        Login l = new Login();
        while (true){
            System.out.println("enter username : ");
            username = in.nextLine();
            System.out.println("enter password : ");
            password = in.nextLine();
            if(!l.loginUser(username,  password)){//check if username exists
                char c;
                System.out.println("Do you want to enter again ? y/n");
                c = in.next().charAt(0);
                in.nextLine();

                if(c != 'y'){
                    return null;
                }
            }
            else {
                return l.loadUser(username);
            }
        }


    }

    public static void payBill(User user) {
        Scanner scanner = new Scanner(System.in);
        Bill bill = null;

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("write the type of bill the you want:");
        System.out.println("1. Electricity");
        System.out.println("2. Water");
        System.out.println("3. Gas");
        System.out.println("----------------------------------------------------------------------------------------");


        String billType = scanner.nextLine();
        BillFactory f = new BillFactory();
        bill = f.createBill(billType);
        if(bill != null){
            System.out.println("Enter the num of receipt:");
            String numberOfReceipts = scanner.next();
            bill.setUser(user);
            bill.createBill(numberOfReceipts);
        }
        else{
            System.out.println("wrong input");
        }
    }

    public static void transfer(User user){
        int option = user.loadTransactionMenu();
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        if(choose == 1){
            System.out.println("enter the amount : ");
            int amount = scanner.nextInt();
            Transaction  t = new TransactionToWallet(user , amount);
            if(t.transfer()){
                System.out.println("Transaction done! ");
            }
            else {
                System.out.println("Transaction failure! ");
            }
        } else if (choose == 2){
            System.out.println("enter the amount : ");
            int amount = scanner.nextInt();
            Transaction  t = new TransactionToInstaAccount(user , amount);
            if(t.transfer()){
                System.out.println("Transaction done! ");
            }
            else {
                System.out.println("Transaction failure! ");
            }

        } else if (choose == 3 && option==3) {
            System.out.println("enter the amount : ");
            int amount = scanner.nextInt();
            Transaction  t = new TransactionToBank(user , amount);
            if(t.transfer()){
                System.out.println("Transaction done! ");
            }
            else {
                System.out.println("Transaction failure! ");
            }
        }


    }

    public static void seeding(){
        UserDataBase db = new UserDataBase();

        Account a = new AlahlyBank("14785698745236" , "01236987452");

        User u = new BankUser("mhmd" , "12346579" , "mh@insta.com" , a);

        db.saveUser(u);

        Account a1 = new AlahlyBank("14785698745236" , "01045875698");

        User u1 = new BankUser("ahmed" , "12346ahmd9" , "ahmed@insta.com" , a1);

        db.saveUser(u1);

        Account a2 = new CIBWallet("01100913553");

        User u2 = new WalletUser("ali" , "123789456" , "ali@insta.com" ,a2 );

        db.saveUser(u2);



    }

}