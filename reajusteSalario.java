import java.util.Scanner;

public class reajusteSalario {
	
	public static void main(String[] args) {
		
		float salario;
		float aumento = 0.2F;
		String nome;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Nome do funcionario: ");
		nome = leitor.next();
		
		while(!nome.equals("fim")){
			
			System.out.println("Informe o salario: ");
			salario = leitor.nextFloat();
			
			if(salario < 500){
				
				salario = salario*aumento + salario;
				System.out.println("Salario final: " + salario);
				
			}else{
				
				System.out.println("Voce nao tem direito a aumento");
				System.out.println("Nome do funcionario: ");
				nome = leitor.next();
				
			}
		}
		
		
		leitor.close();
	}

}
