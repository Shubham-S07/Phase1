public class ThrowsEx
    {
        void Division() throws ArithmeticException
        {
            int a=81,b=0,r;
r = a / b;
            System.out.print("The result is  " + r);
        }
         public static void main(String[] args)
        {
ThrowsEx T = new ThrowsEx();
             try
            {
                T.Division();
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("Error  " + Ex.getMessage());
            }
            System.out.print("\nEnd of program.");
        }
    }
