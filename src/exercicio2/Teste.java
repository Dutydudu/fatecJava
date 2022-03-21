package exercicio2;

public class Teste {

	public static void main(String[] args) {
		
								//Cliente - Sald - Limit
		Cliente c1 = new Cliente("Moacir da Silva Santos", 300.00, 500.00);
		Cliente c2 = new Cliente("Cleber Oliveira Machado", 900.00, 1200.00);
		
		
		Doc doc = new Doc (500, c1);
		
		doc.Tranferir(c1, c2, 200);
		
		doc.showDoc();
		c2.mostrar();

	}

}
