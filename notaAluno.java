import java.util.Scanner;

public class notaAluno {

	public static void main(String[] args) {
		
		int aprovado = 0, reprovado = 0, exame = 0;
		int i;
		float nota1, nota2;
		float media;
		float acumulador_media = 0.0f;
		float media_classe;
		Scanner input = new Scanner(System.in);
		
		for(i=1; i<7; i++){
			
			System.out.println("Primeira nota: ");
			nota1 = input.nextFloat();
			
			System.out.println("Segunda nota: ");
			nota2 = input.nextFloat();
			
			media = (nota1 + nota2)/2;
			
			if (media < 3){
				
				System.out.println("Media: " + media);
				System.out.println("Aluno reprovado\n");
				reprovado++;
				acumulador_media += media;
				
			} else {
				
				if (media < 7 && media >= 3){
					
					System.out.println("Media: " + media);
					System.out.println("Aluno na final\n");
					exame++;
					acumulador_media += media;
					
				} else {
					
					System.out.println("Media: " + media);
					System.out.println("Aluno aprovado!\n");
					aprovado++;
					acumulador_media += media;
				}
			}
		}
		
		System.out.println(reprovado + " alunos reprovados");
		System.out.println(exame + " alunos na final");
		System.out.println(aprovado + " alunos aprovados");
		
		media_classe = acumulador_media/i;
		
		System.out.println("Media da classe: " + media_classe);
		
		input.close();
	}
}

