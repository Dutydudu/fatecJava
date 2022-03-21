package exercicio1;
	
public class Partido {
	
	private String nomePartido, ideologia, sigla;
	private int numPartido;
	
	public Partido(String nomePartido, String ideologia, String sigla, int numPartido) {
		this.nomePartido = nomePartido;
		this.ideologia = ideologia;
		this.sigla = sigla;
		this.numPartido = numPartido;
	}
	
	public void mostrarPartido() {
		System.out.println("Partido: " + nomePartido);
		System.out.println("Sigla: " + sigla);
		System.out.println("Numero do partido: " + numPartido);
		System.out.println("Ideologia: " + ideologia );
	}
}