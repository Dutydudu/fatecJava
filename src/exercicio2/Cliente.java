package exercicio2;

public class Cliente {
	
	private String nome;
	private double saldo, limite, check;
	
	//Constructor
	public Cliente(String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	public String getName() {
		return nome;
	}
	
	public double getLimit() {
		return limite;
	}
	
	public double getBalance() {
		return saldo;
	}

	
	public double checkBalance() {
		check = saldo + limite;
		return check;
	}
	
	public void depositar(double val) {
		saldo = saldo + val;
	}

	public void sacar(double val) {
		if (check >= val) {
			saldo = saldo - val;
		}	else {
				System.out.println("Saldo total e insufieciente!");
				System.out.println();
			}
	}
	
	public void mostrar() {
		System.out.println("Nome do Cliente: " + nome);
		System.out.println("Limite total: " + limite);
		System.out.println("Saldo disponivel: " + saldo);
		System.out.println();
	}
}
