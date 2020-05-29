class Simple
{
public static void main(String [] args)
{
if(args.length==0)
 System.out.println("No Values");
else
{
 for(int i = 0;i<args.length;i++)
 {
    System.out.print(args[i]);
    if(i<args.length-1)
    {
        System.out.print(",");
    }
  }    
}
}
}

OUTPUT:

C:\Users\Mageshwar\Desktop>java Simple
No Values

C:\Users\Mageshwar\Desktop>java Simple mumbai banglore
mumbai,banglore
C:\Users\Mageshwar\Desktop>
