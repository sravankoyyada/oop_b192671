package bank;

import java.util.Scanner;

public class money_implement implements money{
    double m;
     String p;
     String u;
    public  money_implement(String u,String p,double m)
    {
        this.p=p;
        this.u=u;
        this.m=m;
    }
    

    public boolean credentialsCheck(String uname,String pname ,boolean login)
    {
        try{
              /*Scanner sn=new Scanner(System.in);
              String uname=sn.nextLine();
              String pname=sn.nextLine();*/
              if(uname.equals(u)&&pname.equals(p))
              {
                login=true;
                return login;
              }
              else{
                throw new Exception("missmatch");
              }
        }

        catch(Exception e){
            System.out.println("ERROR");
        }
        return false;
    }
 
    public void credit(double x)
    {
         m=m+x;
         displayBalance();
    }

    public void debit(double x,boolean login) 
    {
       try{if (login && x<m) {
            m=m-x;
        displayBalance();
       } 
       else throw new Exception("insufficiant");
        }
        catch(Exception e)
        {
            System.out.println("Insuffiant Balance");
        }
    }

    public void displayBalance()
    {
        System.out.println(m);
    }

    public void exit(boolean login)
    {
        login=false;
    }

    
}
