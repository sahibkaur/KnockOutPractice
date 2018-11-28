import java.util.Scanner;
import Operations.*; 
public class InheritCalculator extends AllOperation{
	public static void main(String[] args){
		System.out.println("Enter the operation to perform(i.e.,+,-,*,/):");
		char ch;
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
					result=sum(result,num2);
					break;
				case '-':
					result=sub(result,num2);
					break;
				case '*':
					result=multiply(result,num2);
					break;
				case '/':
					result=divide(result,num2);
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
