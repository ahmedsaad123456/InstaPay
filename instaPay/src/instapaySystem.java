
import UserAuthentication.*;
import UserData.BankUser;
import UserData.User;
import UserData.WalletUser;
import BillManagment.*;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class instapaySystem {


    public static void main(String[] args) {

        User user = new BankUser() ;

        Scanner scanner = new Scanner(System.in);

        int choice;
        boolean isLoggedIn = false; // Flag to track if the user is logged in

        do {
            // Display the login menu if the user is not logged in
            if (!isLoggedIn) {
                System.out.println("Login Menu:");
                System.out.println("1. Sign up");
                System.out.println("2. Sign in");
                System.out.println("3. Exit");
                System.out.print("Choose an option (1-3): ");
            } else {
                // Display the main menu if the user is logged in
                user.loadProfile();
                System.out.println("Main Menu:");
                System.out.println("1. Inquire Balance");
                System.out.println("2. Pay Bill");
                System.out.println("3. Transfer Money");
                System.out.println("4. Logout");
                System.out.print("Choose an option (1-4): ");
            }

            // Read the user's choice
            choice = scanner.nextInt();

            // Process the user's choice based on login status
            if (!isLoggedIn) {
                // If not logged in, process login menu choices
                switch (choice) {
                    case 1:
                        user = manageSignup(user);
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
                switch (choice) {
                    case 1:
                        System.out.println("You chose: Inquire Balance");
                        // Add logic for inquiring balance here
                        break;
                    case 2:
                        System.out.println("You chose: Pay Bill");
                        payBill(user);
                        break;
                    case 3:
                        System.out.println("You chose: Transfer Money");
                        // Add logic for transferring money here
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

    public static User manageSignup(User user) {
        Scanner scanner = new Scanner(System.in);

        Registration r = new AlahlyBankRegistration();

        System.out.println("Choose the type of registration:");
        System.out.println("1. Bank");
        System.out.println("2. Wallet");
        System.out.print("Enter your choice (1 or 2): ");

        int registrationType = scanner.nextInt();

        if (registrationType == 1) {
            // Bank registration
            user = new BankUser();
            System.out.println("Choose the bank:");
            System.out.println("1. Alahly");
            System.out.println("2. Misr");
            System.out.print("Enter your choice (1 or 2): ");

            int bankChoice = scanner.nextInt();

            // Set user information based on bank choice
            if (bankChoice == 1) {
                r = new AlahlyBankRegistration();
                if(r.signUp(user)){
                    return user;
                }
                else {
                    return null;
                }
            } else if (bankChoice == 2) {
                r = new MisrBankRegistration();
                if(r.signUp(user)){
                    return user;
                }
                else {
                    return null;
                }
            } else {
                System.out.println("Invalid bank choice.");
                return null;
            }
        } else if (registrationType == 2) {
            // Wallet registration
            user = new WalletUser();
            System.out.println("Choose the wallet provider:");
            System.out.println("1. Vodafone Cash");
            System.out.println("2. Fawry");
            System.out.println("3. CIB Wallet");
            System.out.print("Enter your choice (1, 2, or 3): ");

            int walletChoice = scanner.nextInt();

            // Set user information based on wallet choice
            if (walletChoice == 1) {
                r = new VodafoneRegistration();
                if(r.signUp(user)){
                    return user;
                }
                else {
                    return null;
                }
            } else if (walletChoice == 2) {
                r = new FawryWalletRegistration();
                if(r.signUp(user)){
                    return user;
                }
                else {
                    return null;
                }
            } else if (walletChoice == 3) {
                r = new CIBWalletRegistration();
                if(r.signUp(user)){
                    return user;
                }
                else {
                    return null;
                }
            } else {
                System.out.println("Invalid wallet choice.");
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
            if(!l.loginUser(username,  password)){
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
        Bill bill;

        System.out.println("Choose the type of bill:");
        System.out.println("1. Electricity");
        System.out.println("2. Water");
        System.out.println("3. Gas");
        System.out.print("Enter your choice (1 or 2 or 3): ");

        int billType = scanner.nextInt();
        if (billType == 1) {
            bill = new Electricity();
            bill.setUser(user);
            bill.createBill();
        } else if (billType == 2) {
            bill = new Water();
            bill.setUser(user);
            bill.createBill();
        } else if (billType == 3) {
            bill = new Gas();
            bill.setUser(user);
            bill.createBill();
        }
    }

}