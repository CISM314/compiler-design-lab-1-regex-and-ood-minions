package bankacount;
import java.util.Scanner;
public class BankAccount {

        static int num; 
        static double amount;
    static Scanner scan = new Scanner(System.in);
    static double savingsBalance;
    static double checkingBalance;
    static double investmentBalance;

    public static void main(String[] args) {
      
        savingsAccount saving = new savingsAccount();
        checkingAccount checking = new checkingAccount();
        investmentAccount investment = new investmentAccount();
        do{

        System.out.println("Welcome!        Mr Hope Mogale");
        System.out.println("Account number: 1412256585 ");
        System.out.println("NWU-Bank");
        System.out.println("------------------------");
        System.out.println("To check Balance press 0");
        System.out.println("which account would you like to access");
        System.out.println("press 1 for savings");
        System.out.println("press 2 for checking");
        System.out.println("press 3 for investment");
        System.out.println("");
        System.out.println("4. Exit");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        num = scan.nextInt();
        if(num == 0){
           System.out.println("Your Savings balance is " + saving.savingsBalance + "<<--------Here is your balance");
           System.out.println("Your checking balance is " + checking.checkingBalance + "<<----------here is your balance");
           System.out.println("Your investment balance is " + investment.investmentBalance + "<<------here is your balance");
        }
        else if(num == 1){
        saving.saving();
        }
        else if(num == 2){
        checking.checking();
        }
        else if(num == 3){
            investment.investment();
        
        }
        else if(num == 4){
            System.out.println("Goodbye!");
        }
        else{
            System.err.println("Invalid number");
        }
        }while(num != 4);
    }
}
