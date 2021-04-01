package za.ac.cput;
import java.util.Scanner;

/** ADP3
 * 219404070
 * Assignemnt 1
 * Emeka Thato Nwamadi
 * Bank Application that displays Object Equality and Object Identity
 */


public class App 
{
    public static void main(String[] args) {

        BankAccount object1 = new BankAccount("Thato","AC001");
        object1.showMenu();

    }

//    test statement
    public String test(int number) {
        return "";
    }
}

class BankAccount
{
    int balance;
    int previousTransact;
    String custName;
    String custID;

//    constructor added
    BanckAccount(String cname, String cid){
            custName = cname;
            custID = cid;
    }

//    account deposit calculation
    void deposit(int amt){
        if(amt !==0){
            balance = balance + amt;
            previousTransact = amt;
        }
    }
//     account wihdraw calculation
    void withdraw(int amt){
        if(amt !==0){
//            balance representing account ballance and available amount represenetd by amt
            balance = balance - amt;
            previousTransact = -amt;
        }
    }

    void getpreviousTransact(){
        if (previousTransact > 0){
            System.out.println("You have deposited: "+previousTransact);
        }else if (previousTransact < 0){
            System.out.println("you have withdrawn: "+Math.abs(previousTransact));
        }else{
            System.out.println("Tranaction not executed");
        }
    }
    void showMenu(){

        char options='\0';
        Scanner keybd = new Scanner(System.in);

        System.out.println("Good day! "+custName);
        System.out.println("Your account number is : "+custID);
        System.out.println("\n");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Previous Transaction");
        System.out.println("5. EXIT");

        do{
            System.out.println("------------------------------------------------");
            System.out.println("Enter an option");
            System.out.println("------------------------------------------------");
            option = scanner.next().charArt(0);
            System.out.println("\n");

//            switch statememt
            switch(option){

                case '1';
                    System.out.println("------------------------------------------------");
                    System.out.println("Balance : "+balance);
                    System.out.println("------------------------------------------------");
                    System.out.println("\n");
                    break;

                case '2';
                    System.out.println("------------------------------------------------");
                    System.out.println("How much do you want to deposit  : R"+balance);
                    System.out.println("------------------------------------------------");
                    int amt = scanner.nextInt();
                    deposit(amt);
                    System.out.println("\n");
                    break;

                case '3';
                    System.out.println("------------------------------------------------");
                    System.out.println("How much do you want to withdraw  : R");
                    System.out.println("------------------------------------------------");
                    int amt2 = scanner.nextInt();
                    deposit(amt2);
                    System.out.println("\n");
                    break;

                case '4';
                    System.out.println("------------------------------------------------");
                    getpreviousTransact();
                    System.out.println("------------------------------------------------");
                    System.out.println("\n");
                    break;

                case '5';
                    System.out.println("===============================================");
                    break;

                default
                    System.out.println("Invalid Option. Please Re-Enter");
                    break;
            }while(option != '5');
            System.out.println("Thank you, Goodbye.");
        }
    }
}