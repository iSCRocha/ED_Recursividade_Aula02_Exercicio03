package controller;

public class Funcional03 {
	
	public Funcional03() {
		super();
	}
	
	int qtd = 0;

	public int contaPares(int[] vet, int tam) {

		if(tam > 0) {
			int index = tam - 1;
			
			if(vet[index] % 2 == 0) { // percorre o vetor da última posição até a primeira
				qtd = qtd + 1;
			}
			
			tam = tam - 1;
			return contaPares(vet, tam);
		} else {
			return qtd;
		}
		
	}
}


/*
 
 * Construir uma função recursiva
 * que receba um vetor e seu tamanho
 * e apresente a quantidade de números pares existentes no vetor.
 * Considere que a entrada deve ser, apenas de números naturais diferentes de zero.
 
 */
