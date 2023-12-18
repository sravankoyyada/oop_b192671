import complex.arith;

public class complexnum{
    public static void main(String args[])
    {
       
        arith ar=new arith();
          arith a1=new arith(3,3);
        arith a2=new arith(3,3);

         ar.add(a1,a2);
        System.out.println();
         ar.sub(a1,a2);
    }
}