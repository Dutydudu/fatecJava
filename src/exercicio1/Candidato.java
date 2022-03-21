package exercicio1;

public class Candidato {
	
	private String nomeCandidato;
	private Partido partido;
	
	
	public Candidato(String nomeCandidato, Partido partido) {
		this.nomeCandidato = nomeCandidato;
		this.partido = partido;
	}
	
	
	public void mostrar() {
		System.out.println("Candidato: " + nomeCandidato);
		partido.mostrarPartido();
	}
	
}
