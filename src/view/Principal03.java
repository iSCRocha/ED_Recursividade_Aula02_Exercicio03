package view;

import controller.Funcional03;

public class Principal03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcional03 funcional = new Funcional03();
		
		int[] vetor = {8, 4, 7, 1, 2, 3, 9, 10};
		System.out.println("Resultado esperado => " + 4);
		int resultado = funcional.contaPares(vetor, vetor.length);
		System.out.println("Resultado alcançado => " + resultado);

	}

}
