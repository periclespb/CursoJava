import java.util.Scanner;

public class imparOuPar {
	public static void main(String[]args) {
		
		int x;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("Digite um numero de 1 a 10: ");
		x=leitor.nextInt();
		
		if(x%2==0) {
			System.out.println("O numero digitado eh par "+x);
		}
		
		else {
			System.out.println("O numero digitado eh impar "+x);
		}
		
		
	}

}
