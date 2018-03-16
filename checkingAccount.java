
package bankacount;

public class checkingAccount extends BankAccount{
    
    double checkingBalance;

    public void checking(){
        
        System.out.println("W     Mr Hope Mogale");
        System.out.println("Account number: 1412256585 ");
        System.out.println("NWU-Bank");
        System.out.println("------------------------");
        System.out.println("Select a Transaction by typing number");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Balance");
        System.out.println("4. To go back");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        num = scan.nextInt();
        
        if (num == 1) { //if CHECKING is selected
                    
                    //enter amount to be deposited
                   System.out.println("------------------------");
                    System.out.println("Enter amount to deposit in checking account: ");
                    System.out.println("------------------------");
                    amount = scan.nextDouble();
                    if(num == 1){
                        checkingBalance += amount;
                        System.out.println("------------------------");
                        System.out.println("Your checking account's balance is " + checkingBalance);
                        System.out.println("------------------------");
                    }else{
                        System.out.println("Your checking account's balance is " + checkingBalance);
                    }
    }
        else if (num == 2) {
            System.out.println("------------------------");
                    System.out.println("Enter amount to withdrawal: ");
                    System.out.println("------------------------");
                    amount = scan.nextDouble();
                    System.out.println("------------------------");
                    System.out.println("Would you like to continue this transaction?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println("------------------------");
                    num = scan.nextInt();
                    if(num == 1){
                        if (checkingBalance < amount){
                            System.out.println("Insufficient Funds!!!");
                            System.out.println("Your checking account's balance is " + checkingBalance);
                        }else{
                            checkingBalance -= amount;
                            System.out.println("Your checking account's balance is " + checkingBalance);
                        }
                    }
                    else{
                        System.out.println("Your checking account's balance is " + checkingBalance);
                    }       
                }
        else if(num ==3){
            System.out.println("Your checking balance is " + checkingBalance + "<<----------here is your balance");
            System.out.println("-____---____--___--_____--______--_____--");
        }
        else{
        
        }
    }}


