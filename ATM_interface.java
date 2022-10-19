 
import java.util.Scanner;  
public class ATM_interface
{    
    public static void main(String args[] )  
    {    
        int balance = 75000, withdraw, deposit;  
        Scanner sc = new Scanner(System.in);  
        while(true)  
        {  
            System.out.println("ATM Interface");  
            System.out.println("Press 1 to Withdraw Money");  
            System.out.println("Press 2 to Deposit Money");  
            System.out.println("Press 3 to Check Balance");  
            System.out.println("Press 4 to Quit");  
            System.out.print("Choose the operation:");   
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                System.out.print("Enter the money you want to withdraw:");   
                withdraw = sc.nextInt();  
                if(balance >= withdraw)  
                {    
                balance = balance - withdraw;  
                System.out.println("Collect your money");  
                }  
                else  
                {    
                System.out.println("Insufficient Balance");  
                }  
                System.out.println("");  
                break;  
                /////
                case 2:  
                System.out.print("Enter money to be deposited:");  
                deposit = sc.nextInt();  
                balance = balance + deposit;  
                System.out.println("Your Money has been successfully depsited");  
                System.out.println("");  
                break;  
                /////
                case 3:  
                System.out.println("Balance : "+balance);  
                System.out.println("");  
                break;  
                /////
                case 4:  
                System.exit(0);  
            }  
        }  
    }  
}  