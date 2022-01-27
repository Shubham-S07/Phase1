package typeCasting;

public class narrowingCasting { 
    public static void main(String args[])  
    {  
    double d = 188.88;  
    long l = (long)d;  
    int i = (int)l;  
    System.out.println("Before conversion: "+d);  
    System.out.println("After conversion into long type: "+l);  
    System.out.println("After conversion into int type: "+i);  
    }  
}