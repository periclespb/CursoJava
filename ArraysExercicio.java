package exerciciosJava;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercicio {

	public static void main(String[] args) {
		  
		int array[] = new int[300];
		
		// -- Questao 01
		for(int i = 0; i < array.length; i++){
			array[i] = 45;
		}
		
		// -- Questao 02
		for(int i = 0; i < array.length; i++){
			System.out.println("array["+i+"] == " + array[i]);
		}
		
		for(int elemento : array){
			System.out.println(elemento);
		}

		int contador = 0;
		do{
			System.out.println("array["+contador+"] == " + array[contador]);
		}while(contador < array.length);
		
		
		// -- Questao 03	
		int array2[] = new int[10];
		Scanner scan = new Scanner(System.in);
		
		// pegar dados
		for(int i = 0; i < array2.length; i++){
			System.out.print("Insira o valor da posicao " + i + ": ");
			array2[i] = Integer.parseInt( scan.nextLine() ); // pra nao "bugar" o scanner
		}
		
		// ordenar dados
		ordenarInteiros(array2);
		
		// busca
		int elemento = 0;
		int posDoElemento = buscarInteiroNoArray(array2, elemento);
		
	}
	
	/**
	 * Ordena um array de inteiros de forma crescente
	 * 
	 * @param array de inteiros, ja deve ter sido inicializado
	 */
	public static void ordenarInteiros(int[] array){
		
		int aux = 0;
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length; j++){
				
				if(array[i] < array[j]){
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
				
			}
		}
	}
	
	/**
	 * Busca um elemento em um array de inteiros
	 * 
	 * @param array de inteiros, ja deve ter sido inicializado
	 * @param elemento a ser buscado no array
	 * @return a posicao do elemento no array ou -1 se caso nao existir
	 */
	public static int buscarInteiroNoArray(int[] array, int elemento){
		
		for(int i = 0; i < array.length; i++){
			if(array[i] == elemento){
				return i;
			}
		}
		
		return -1;
	}
}
