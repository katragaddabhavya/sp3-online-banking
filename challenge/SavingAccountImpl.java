package challenge;
import java.util.Scanner;

public class SavingAccountImpl {
    public static void main(String[] args){
        SavingAccount account=new SavingAccount();
        account.setAccountholdername("john");
        account.setAccountnumber(123456789);
        account.setAccountopeningdate("26/08/1993");
        account.setAvailablebalance(45000);
        account.setAccountstatus("active");
        account.setInterestrate(10);
        account.setModeofoperation("self");
        account.setTotalbalance(10000);
        account.setinternetandmobilebanking(true);
        System.out.println("enter 1 for checkbalance, 2 for debit cash, 3 for credit cash");
        Scanner Sc=new Scanner(System.in);
        int choice=Sc.nextInt();
        switch(choice){
            case 1:
                account.getcheckBalance();
                break;
            case 2:
                System.out.println("enter debit cash");
                double debitcash=Sc.nextDouble();
                account.setCalculatedebitamount(debitcash);
                break;
            case 3:
                System.out.println("enter credit cash");
                double creditcash=Sc.nextDouble();
                account.setCalculatecreditedamount(creditcash);
                break;
            default:
                System.out.println("wrong choice");

        }
        account.Displaydetails();

    }

}
