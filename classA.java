public class classA
{
   public void meth1() 
   {
      System.out.println("Hi");
      classA aobj=new classA();  // Creating Object
      aobj.meth2();  // Calling a method
   }
   public void meth2() 
   {
      System.out.println("Hello");
      
   }
   public static void main(String args[])
   {
      classA aobj=new classA();  // Creating Object
      aobj.meth1();   // Calling a method
      aobj.meth2();   // Calling a method
      System.out.print("Hello World");
   }
}
