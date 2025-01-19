import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		switch(ch) {
		case'+':
			System.out.println(num1+num2);
			break;
		case'-':
			System.out.println(num1-num2);
			break;
		case'*':
			System.out.println(num1*num2);
			break;
		case'/':
			System.out.println(num1/num2);
			break;	
		default:
			System.out.println("Enter a valid symbol");
		}
	}

}
