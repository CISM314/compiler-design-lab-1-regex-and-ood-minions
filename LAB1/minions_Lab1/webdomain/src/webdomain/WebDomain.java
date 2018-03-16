
package webdomain;

import java.util.Scanner;

public class WebDomain {
    
    Scanner input=new Scanner(System.in);
    private String webDomain1 = ".[a-zA-Z]{1,2}.[a-zA-Z]{1,2}$";
    private String Domain;

    public void setDomain(){
        this.Domain = Domain;
    }
    public String getDomain(){
        return Domain;
    }
    public void Decide(){
        System.out.println("enter Webdomain" +"\n"+ "In the format'.co.za' to validate the domain only");
        Domain = input.next();
        if(Domain.matches(webDomain1)){
            System.out.println("Domain validated");
        }
        else 
        {
            System.out.println("Domain format incorrect");
        }
    }
    public static void main(String[] args) {
        
        WebDomain getDomain = new WebDomain();
        getDomain.Decide();
    }
}