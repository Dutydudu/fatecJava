package exercicio3;

public class Teste {

	public static void main(String[] args) {
		//test 1
		Bateria bateria = new Bateria(100);
		
		Celular celular = new Celular ("Jacinto",1092821343, bateria);
		
		celular.mostrar();
		
		celular.somCel();
		
		celular.ligarCel();
		
		celular.desligarCelular();

	}

}
