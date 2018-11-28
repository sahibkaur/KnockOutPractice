import java.util.Scanner;
import Operations.*; 
public class Calculator{
	public static void main(String[] args){
		System.out.println("Enter the operation to perform(i.e.,+,-,*,/):");
		Sum add=new Sum();
		char ch;
		Subtract diff=new Subtract();
		Multiply product=new Multiply();
		Divide div=new Divide();
		char choice;
		Scanner scn=new Scanner(System.in);
		choice=scn.next().charAt(0);
		int num1;
		int num2;
		System.out.println("Enter values:");
		num1=scn.nextInt();
		num2=scn.nextInt();		
		int result=num1;
		do{
			switch(choice)
			{
				case '+':
					result=add.sum(result,num2);
					break;
				case '-':
					result=diff.sub(result,num2);
					break;
				case '*':
					result=product.multiply(result,num2);
					break;
				case '/':
					result=div.divide(result,num2);
					break;
			}
			System.out.println(result);
			System.out.println("Do u want to continue operations?(y/n)");
			ch=scn.next().charAt(0);
			if(ch=='y'){
				System.out.println("Enter choice of operation and value");
				choice=scn.next().charAt(0);
				num2=scn.nextInt();
			}
		}while(ch=='y');
	}		
}

