package exercicio4;

public class Teste {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Narnica", "Azevedo");
		Formato fmt = new Formato ("PDF", 50.0, true, l1);
		fmt.showFormat();
		
		
		Livro l2 = new Livro("Peruibiza", "Marcos");
		Formato fmt2 = new Formato ("EPUB", 100.0, false, l2);
		fmt2.showFormat();
		
		
		Livro l3 = new Livro("Harry Brother", "Eliza");
		Formato fmt3 = new Formato ("Fisico", 45.0, true, l3);
		fmt3.showFormat();
	}

}
