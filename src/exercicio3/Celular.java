package exercicio3;

public class Celular {
	
	private String usuario;
	private int identificador;
	private Bateria bateria;
	private boolean celular;
	
	
	public Celular(String usuario, int identificador, Bateria bateria) {
		this.usuario = usuario;
		this.identificador = identificador;
		this.bateria = bateria;
	}

	
	public int getIdentifier() {
		return identificador;
	}
	
	
	public String getUser() {
		return usuario;
	}
	

	public Bateria getBattery() {
		return bateria;
	}
	
	
	public void ligarCel() {
		if (bateria.getCharge() > 20) {
			bateria.discharge();
			bateria.discharge();
			System.out.println("Usuário: " + usuario);
			celular = true;
		}else {
			System.out.println("Bateria Fraca, Conecte o Carregador");
		}
	}
	
	
	public void desligarCelular() {
		System.out.println("Bateria Muito Fraca");
		System.out.println("Desligando o Celular em 3, 2, 1 ....");
		bateria.discharge();
		celular = false;
	}
	
	
	public void somCel() {
		if (celular = true && bateria.getCharge() >= 10) {
			System.out.println("Tocando..");
			System.out.println();
		}
	}
		
	public void mostrar() {
		System.out.println("Identificador do Celular: " + identificador);
		System.out.println("Nome de Usuário: " + usuario);
		bateria.showCharge();
		System.out.println();
	}
}
