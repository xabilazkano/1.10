import java.util.Scanner;
public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=0;
		Scanner sc = new Scanner(System.in);
		
		while (a!=0) {
			System.out.println("Tell me a number: ");
			a = sc.nextInt();
			while (b<a) {
			System.out.print("* ");
			b++;
		}
			b=0;
			System.out.println();
	}
	
		System.out.println("The programm has finished");

}
}