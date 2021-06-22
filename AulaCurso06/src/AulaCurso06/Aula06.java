package AulaCurso06;

public class Aula06 {

	public static void main(String[] args) {
		
		Lutador lutador[] = new Lutador[6]; 
				
		lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		lutador[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		lutador[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		lutador[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 120.9f, 13, 0, 2);
		lutador[4] = new Lutador("J Barvin", "Colombia", 34, 1.75f, 78.9f, 14, 0, 1);
		lutador[5] = new Lutador("Shawn Mendes", "Canadá", 23, 1.88f, 119.9f, 15, 0, 0);
		
		Luta UFC01 = new Luta();
		
		UFC01.marcarLuta(lutador[1], lutador [3]);
		UFC01.lutar();
	}
}
