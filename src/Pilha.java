public class Pilha {
	
	private No topo;
	
	public void inserir(String elemento) {
		No novo = new No();
		novo.elemento = elemento;
		novo.ant = topo;
		topo = novo;
	}
	
	public String excluir() {
		if(topo != null) {
			String elemento = topo.elemento;
			topo = topo.ant;
			return elemento;
		} else {
			System.out.print("Esta pilha está vazia");
			return null;
		}
	}
	
	public void listar() {
		No aux = topo;
		while(aux != null) {
			System.out.println(aux.elemento);
			aux = aux.ant;
		}
	}

}
