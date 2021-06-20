package AulaCurso05;

public class Aula05 {
	public static void main(String[] agrs) {
		
		ControleRemoto controle = new ControleRemoto();
		
		controle.ligar();
		controle.abrirMenu();
		controle.maisVolume();
		controle.play();
		//controle.ligarMudo();
		controle.fecharMenu();
	}
}
