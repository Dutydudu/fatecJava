package exercicio2;

public class Doc {
	
	private double quantia;
	private Cliente cliente;

	
	public Doc(double quantia, Cliente cliente) {
		this.quantia = quantia;
		this.cliente = cliente;

	}
		
	
	public void Tranferir(Cliente c1, Cliente c2, double quantia) {
		c1.sacar(quantia);
		c2.depositar(quantia);
	}
	
	
	public double getAmount() {
		return quantia;
	}

	
	public void showDoc() {
		cliente.mostrar();
	}
}
