import java.util.ArrayList;

public class ListaContatos {
	
	ArrayList<String> lista = new ArrayList<>();
	
	public void listarContatos() {
		System.out.println("");
		System.out.println("Lista de Contatos Telefônicos");
		System.out.println("");
		
		lista.add(": Rafael   - (11) 98745-6213");
		lista.add(": Leandro  - (11) 92134-7845");
		lista.add(": Winicius - (11) 93548-3564");
		lista.add(": Ricardo  - (11) 97895-4678");
		lista.add(": Vinicius - (11) 94896-3265");
		lista.add(": Nicholas - (11) 99421-7952");
		lista.add(": Victor   - (11) 99874-3201");
		lista.add(": Eduardo  - (11) 90302-3568");
		lista.add(": Rogerio  - (11) 97985-9987");
		lista.add(": Hugo     - (11) 94039-3025");
		
		int n = lista.size();
		int i;
		for(i=0; i<n; i++) {
			System.out.println("Contato " + i + lista.get(i));
		}
	}
}
