import java.util.Scanner;

public class salarioFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor= new Scanner(System.in);
		double salario;
		double porcentagem;
		
		
		System.out.println("Digite o salario: ");
		salario=leitor.nextDouble();
		System.out.println("Salario= "+salario);
		
		System.out.println("Digite a porcentagem: ");
		porcentagem=leitor.nextDouble();
		System.out.println("Porcentagem= "+porcentagem);
		
		double novosal = salario*porcentagem/100;
		
		System.out.println("O aumento em reais eh "+novosal);
		
		double novosal2= novosal + salario;
		
		System.out.println("O novo salario em reais eh "+novosal2);
		
		
	
	
		
	}

}
