import java.util.Scanner;

public class SignOfTheInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a>0)
			System.out.println("The given number is a positive number");
		else if(a<0)
			System.out.println("The given number is a negative number");
		else
			System.out.println("The given number is zero");
	}

}

OUTPUT:
-67
The given number is a negative number
43
The given number is a positive number
0
The given number is zero

