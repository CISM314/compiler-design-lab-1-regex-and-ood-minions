package bankacount;

public class investmentAccount extends BankAccount {   
    double investmentBalance;
        public void investment(){
        System.out.println("     Mr Hope Mogale");
        System.out.println("Account number: 1412256585 ");
        System.out.println("NWU-Bank");
        System.out.println("------------------------");
        System.out.println("Select a Transaction by typing number");
        System.out.println("1. Deposit");
        System.out.println("2. Balance");
        System.out.println("\n");
        System.out.println("4. To go back");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        num = scan.nextInt();
        
        if (num == 1) {
                   System.out.println("------------------------");
                    System.out.println("Enter amount to deposit in investment account: ");
                    System.out.println("------------------------");
                    amount = scan.nextDouble();
                if(num == 1){
                        investmentBalance += amount;
                        System.out.println("------------------------");
                        System.out.println("Your investment account's balance is " + investmentBalance);
                        System.out.println("------------------------");
                    }else{
                        System.out.println("Your investment account's balance is " + investmentBalance);
                    }
    }
        else if(num ==2){
            System.out.println("Your investment balance is " + investmentBalance + "<<------here is your balance");
            System.out.println("-____---____--___--_____--______--_____--");
        }
        else{
        
        }
    }}





