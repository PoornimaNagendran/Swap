package guvipractise;
import java.util.Scanner;
public class Swap {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Swap 2 numbers");
System.out.println("Enter 2 numbers");
int a=s.nextInt();
int b=s.nextInt();
System.out.println("Before swap a:"+a+" and b:"+b);
int t=a;
a=b;
b=t;
System.out.println("After swap a:"+a+" and b:"+b);
	}

}
