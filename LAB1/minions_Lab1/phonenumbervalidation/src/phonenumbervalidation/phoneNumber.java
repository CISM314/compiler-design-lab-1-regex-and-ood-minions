package phonenumbervalidation;

import java.util.Scanner;

public class phoneNumber {
    
        Scanner input=new Scanner(System.in);
        String mobileNumber;
        String RegEx = "^[\\+](27|0)\\d{9}";
        String RegEx1 = "^(27|0)\\d{9}";
    
    public void setNumber(){
        this.mobileNumber = mobileNumber;
    }
    public String getNumber(){
        return mobileNumber;
    }
    public void Decide(){
        System.out.println("enter Phone number");
        System.out.println("In this format '+0(+27)796095056'or '0(27)796095056' to validate if it's a SA phone number");
        mobileNumber = input.next();

        if(mobileNumber.matches(RegEx)){
            System.out.println("valid");
        }
        else if(mobileNumber.matches(RegEx1)){
            System.out.println("valid1");
        }
        else {
            System.out.println("phone number isx invalid");
        }
    }
    public static void main(String[] args) {
    
        phoneNumber number = new phoneNumber();
        number.Decide();   
    }
}
