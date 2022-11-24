import java.util.ArrayList;
import java.util.Random;

public class Principal {
	
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random random = new Random();
		Pilha pilhaPar = new Pilha();
		Pilha pilhaImpar = new Pilha();
		
		for (int i = 0; i < 30; i++) {
			Integer r = random.nextInt(51);
			numeros.add(r);
			if (r != 0) {
				if (r % 2 == 0) {
					String n = String.valueOf(r);
					pilhaPar.inserir(n);
				} else {
					String n2 = String.valueOf(r);
					pilhaImpar.inserir(n2);	
				}
			} else {
				pilhaPar.excluir();
				pilhaImpar.excluir();
			}	
		}
		
		System.out.println(numeros);
		System.out.print("\n PILHA DE NÚMEROS PARES: \n");
		pilhaPar.listar();
		System.out.print("\n PILHA DE NÚMEROS ÍMPARES: \n");
		pilhaImpar.listar();
		
	}
	
	
}
