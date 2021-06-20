package AulaCurso04;

public class Aula04 {
	
	public static void main (String[] agrs) {
		
		ContaBanco pessoa1 = new ContaBanco();
		
		pessoa1.setNumConta(102030);
		pessoa1.setDono("Naelly Freire");
		pessoa1.abrirConta("CP");
		pessoa1.setStatus(true);
		pessoa1.depositar(500);
		pessoa1.sacar(100);
		
		ContaBanco pessoa2 = new ContaBanco();
		
		pessoa2.setNumConta(102031);
		pessoa2.setDono("Socorro Freire");
		pessoa2.abrirConta("CC");
		pessoa2.depositar(300);	
		
		pessoa1.estadoAtual();
		pessoa2.estadoAtual();
	}
}
