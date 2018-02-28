import java.util.Scanner;

public class precoGasolina {
	
	public static void main(String[] args) {
		
		float litros;
		float refri = 6;
		float preco = 2.5F;
		float total;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantidade de litros abastecidos: ");
		litros = input.nextFloat();
		
		total = (litros*preco + refri);
		
		System.out.printf("Gasolina: %.2f\n", litros*preco);
		System.out.printf("Refrigerante: %.2f\n", refri);
		System.out.printf("Total: %.2f\n", total);
		
		input.close();
	}

}