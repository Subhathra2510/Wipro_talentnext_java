public class SignOfTheInteger {

	public static void main(String[] args) {
	  int a = Integer.parseInt(args[1]);
	
   if(args[0].equals("Male"))
{
   if(a>=1&&a<=58)
      System.out.print("8.2%");
  else if(a>=59&&a<=120)
      System.out.print("8.3%");	
	}
if(args[0].equals("female"))
{
if(a>=1&&a<=60)
      System.out.print("9.2%");
  else if(a>=61&&a<=120)
      System.out.print("8.3%");
}

}
}


OUTPUT:
C:\Users\Mageshwar\Desktop>java  SignOfTheInteger female 54
9.2%
C:\Users\Mageshwar\Desktop>java  SignOfTheInteger female 61
8.3%
C:\Users\Mageshwar\Desktop>java  SignOfTheInteger Male 45
8.2%
C:\Users\Mageshwar\Desktop>java  SignOfTheInteger Male 64
8.3%
