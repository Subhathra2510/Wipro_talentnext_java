import java.util.Scanner;

public class SignOfTheInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		if((a>=65&&a<=90)||(a>=97&&a<=122))
		{
		System.out.println("Alphabet");
		}
		else if(a>=48&&a<=57)
		{
		System.out.println("Digit");
		}
		else
		{
		System.out.println("Special Character");
		}
		
		
	}

}

OUTPUT: 

98765
Digit

@@@
Special Character

S
Alphabet

