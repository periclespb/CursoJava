import java.util.Scanner;

public class salarioPrefeitura {
	
	public static void main(String[] args) {
		
	
	
	float salario;
	float margem;
	float prestacao;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Salario: ");
	salario = input.nextFloat();
	
	margem = salario*30/100;
	
	System.out.println("Valor da Prestacao: ");
	prestacao = input.nextFloat();
	
	if(margem >= prestacao){
		
		System.out.println("Emprestimo concedido!");
		
	} else {

		System.out.println("Emprestimo negado. Margem insuficiente!");
	}
	
	input.close();
	
	}

}