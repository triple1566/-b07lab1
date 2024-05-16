

public class Driver { 
    public static void main(String [] args) { 
        Polynomial p = new Polynomial(); 
        System.out.println(p.evaluate(3)); 
        double [] c1 = {6,0,0,5}; 
        Polynomial p1 = new Polynomial(c1);
        double [] c2 = {0,-2,0,0,-9}; 
        Polynomial p2 = new Polynomial(c2); 
        Polynomial s = p1.add(p2); 
        System.out.println("s(0.1) = " + s.evaluate(0.1)); 
        if(s.hasRoot(1)) System.out.println("1 is a root of s"); 
        else System.out.println("1 is not a root of s"); 

        //================custom test
        double[] a3 = {1,2,1};
        Polynomial p3 = new Polynomial(a3);
        System.out.println("p3 at 1 is "+p3.evaluate(1));
        System.out.println("3 is p3's root? "+p3.hasRoot(0));
        System.out.println("-1 is p3's root? "+p3.hasRoot(-1));

        double[] a4 = {1};
        Polynomial p4 = new Polynomial(a4);
        System.out.println(p4.evaluate(1));        
        System.out.println(p4.evaluate(10000));
        System.out.println(p4.hasRoot(0));        
    } 
}