package exercicio4;

public class Formato {
	
	private String bookFormat;
	private Livro livro;
	private double preco;
	private boolean disponivel;
	
	public Formato(String bookFormat, double preco, boolean disponivel, Livro livro) {
		this.bookFormat = bookFormat;
		this.preco = preco;
		this.livro = livro;
		this.disponivel = disponivel;
	}
	
	public String getbookFormat() {
		return bookFormat;
	}

	public double getPrice() {
		return preco;
	}

	public void showFormat() {
		if (disponivel == true) {
			System.out.println("Formato: " + bookFormat);
			System.out.println("Preço: " + preco);
			livro.mostrar();
		}
	}
}
