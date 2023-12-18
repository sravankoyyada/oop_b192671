package complex;


public class arith{
    int rp=0,ip=0;

    public  arith(){
        rp=0;
        ip=0;
    }

    public  arith(int ip,int rp){
        this.rp=rp;
        this.ip=ip;
    }

    public void add(arith a1,arith a2)
    {
        int real=a1.rp+a2.rp;
        int img=a1.ip+a2.ip;
        System.out.println(real+"+"+img+"i");
       // System.out.println("imaginary: "+img+"\n\n");
        
    }

    public void sub(arith a1,arith a2){
        int real=a1.rp-a2.rp;
        int img=a1.ip-a2.ip;
        System.out.println(real+"+"+img+"i");
       // System.out.println("imaginary: "+img);
    }
}