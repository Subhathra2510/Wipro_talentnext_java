import java.util.Scanner;

public class SignOfTheInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a<0)
		{
			a=a*-1;
		}
		if(a%2==0)
			System.out.println("The given number is a even number");
		else
			System.out.println("The given number is a odd number");
	}

}


OUTPUT:
67
The given number is a odd number
34
The given number is a even number

