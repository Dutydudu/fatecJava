package exercicio4;

public class Livro {
	
	private String nameBook, nameWriter; 
	
	
	public Livro(String nameBook, String nameWriter) {
		this.nameBook = nameBook;
		this.nameWriter = nameWriter;
	}
	
	
	public void mostrar() {
		System.out.println("Escritor: " + nameWriter);
		System.out.println("Livro: " + nameBook);
		System.out.println();
	}
}
