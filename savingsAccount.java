package bankacount;

public class savingsAccount extends BankAccount{

    double savingsBalance;
    
    public void saving(){
        
        System.out.println("     Mr Hope Mogale");
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
        
        if (num == 1) {
                   System.out.println("------------------------");
                    System.out.println("Enter amount to deposit in savings account: ");
                    System.out.println("------------------------");
                    amount = scan.nextDouble();
                    
                    if(num == 1){
                        savingsBalance += amount;
                        System.out.println("------------------------");
                        System.out.println("Your saving account's balance is " + savingsBalance);
                        System.out.println("------------------------");
                    }else{
                        System.out.println("Your saving account's balance is " + savingsBalance);
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
                        if (savingsBalance < amount){
                            System.out.println("Insufficient Funds!!!");
                            System.out.println("Your savings account's balance is " + savingsBalance);
                        }else{
                            savingsBalance -= amount;
                            System.out.println("Your savings account's balance is " + savingsBalance);
                        }
                    }
                    else{
                        System.out.println("Your savings account's balance is " + savingsBalance);
                    }       
                }
        else if(num ==3){
            System.out.println("Your Savings balance is " + savingsBalance + "<<--------Here is your balance");
            System.out.println("-____---____--___--_____--______--_____--");
        }
        else{
        
        }
    }}

