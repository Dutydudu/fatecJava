package exercicio3;

public class Bateria {
	private double carga;

	public Bateria(double carga) {
		this.carga = carga;
	}

	public void charge() {
		carga = carga + 5;
	}
	
	public void discharge() {
		carga = carga -10;
	}
	public double getCharge() {
		return carga;
	}
	
	public void showCharge() {
		System.out.println("Carga da Bateria: " + carga);
	}
}
