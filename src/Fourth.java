import java.util.Scanner;
public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a=1;
		int result;
		

		while (a!=0) {
			System.out.println("Tell me a number and I will tell you it's square");
			 a = sc.nextInt();
			 result=a*a;
			 System.out.println("The square of "+a+" is: "+result);
			 }
		System.out.println("The program has finished");
	}
	}

