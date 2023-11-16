# Instapay System

## Project Overview

Welcome to the Instapay System project! This system aims to provide users with a convenient platform for money transfers and bill payments. Users can perform various financial transactions, including transferring funds to other Instapay accounts, bank accounts, mobile wallets, and paying utility bills for services like Gas, Electricity, and Water.


## Features 

### User

1. **User Signup:**
   - Users can sign up for the app in two ways:
     - Register using their bank account and the registered mobile number on the bank, verified through the bank API.
     - Register using their mobile number with a wallet provided by a wallet provider (e.g., Vodafone Cash), with mobile number verification through the wallet provider.
   - After verification, users must confirm ownership of the mobile number through OTP.
   - Users need to set a unique username and a complex password.

2. **User Login:**
   - Users can sign in to the system using their Instapay username and password.
   - Upon successful login, the user's profile will be loaded based on their account type.

3. **Transaction Options:**
   - Both types of users (bank account registered and wallet registered) have the option to:
     - Transfer to a Wallet using a mobile number
     - Transfer to Another Instapay account
     - Inquire about their balance
     - Pay bills

4. **Bank Account Registration:**
   - Transferring to a bank account is only valid for users registered using their bank account.

5. **Utility Bill Payment:**
   - The system supports the creation and deduction of bills from the user's account for Gas, Electricity, and Water.
   - Bill contents vary based on the bill types, and assumptions should be made about their details.

## Usage


1. **Compile and Run:**
   - Compile and run the `instapaySystem` class to start the Instapay System.

2. **User Authentication:**
   - You will be prompted with a login menu.
   - Choose one of the following options:
      1. Sign up
      2. Sign in
      3. Exit

### Sign Up

- Choose the type of registration:
   - 1: Bank
   - 2: Wallet
- Follow the prompts to complete the registration process.

### Sign In

- Enter your username and password.
- If you do not have an account, choose to sign up first.
- Once signed in, you will be redirected to the main menu.

### Main Menu

If you successfully sign in, you will have access to the main menu:

1. **Inquire Balance:**
   - Check your account balance.

2. **Pay Bill:**
   - Choose the type of bill to pay (Electricity, Water, Gas).
   - Enter the number of receipts.

3. **Transfer Money:**
   - Choose the destination:
      1. Transfer to Wallet
      2. Transfer to Another Instapay account
      3. Transfer to Bank Account (if applicable)
   - Enter the amount to transfer.

4. **Logout:**
   - Log out from the Instapay System.

### Additional Notes

- The system supports two types of users: Bank Users and Wallet Users.
- Bill contents vary based on the chosen bill type (Electricity, Water, Gas).
- The system is seeded with sample data for demonstration purposes.
- Make sure to follow the on-screen instructions for each operation.


## Contributing

We would like to thank the following contributors to this project:



[Ahmed Saad](https://github.com/ahmedsaad123456).

[Shahd Osama](https://github.com/shahdosama10).

[Salma Abdelaziz](https://github.com/Salmaabdelaziz271).

[Adham Khaled](https://github.com/Adham-K-Fahmy).

Special thanks to everyone who has helped make this project better.


