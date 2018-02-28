import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		int resultado;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("Qual tabuada deseja saber? ");
		numero=leitor.nextInt();
		
		for(int indice=1; indice<=10; indice++) {
			resultado=numero*indice;
			System.out.println(numero+ "x" +indice + "=" +resultado);
		}
	}

}
