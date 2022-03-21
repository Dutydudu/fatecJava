package exercicio1;

public class Teste {

	public static void main(String[] args) {
		Partido partido = new Partido("Revelacao", "Reveladores da verdade", "RSE", 73);
		Candidato candidato = new Candidato ("Genivaldo Lacerda", partido);
		candidato.mostrar();
	}

}
