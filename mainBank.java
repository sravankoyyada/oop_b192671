import bank.money;
import bank.money_implement;
import java.util.*;

public class mainBank {
    public static void main(String args[])
    {
       
        boolean login=false;
        money_implement mi=new money_implement("123","1234",100000.00);
        do{
             Scanner sn=new Scanner(System.in);
             System.out.println("eneter username");
            String s=sn.nextLine();
            System.out.println("enter password");
            String k=sn.nextLine();
            login=mi.credentialsCheck(s,k,login);
            if(login){
            Scanner sc=new Scanner(System.in);

            System.out.println("choose 1-credit,2-debit,3-exit");
            int c=sc.nextInt();
            if(c==1)
            {System.out.println("Eneter crediting money");
                 double w=sc.nextDouble();
                mi.credit(w);
            }
            else if(c==2)
            { System.out.println("Eneter debet money");
                 double d=sc.nextDouble();
                mi.debit(d,login);
            }
            else if(c==3)
            {
                mi.exit(login);
            }

        }
        }while(login);
        

    }
}
