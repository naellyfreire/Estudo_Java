package AulaCurso05;

public class ControleRemoto implements Controlador {
	
	
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	
	//Métodos Especiais
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;  
	}
	
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	//Metodos abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if(this.getLigado()) {
			System.out.println("***MENU***");
			System.out.println("Está ligado? " +this.getLigado());
			System.out.println("Está tocando? " +this.getTocando());
			System.out.print("Volume: " +this.getVolume());
		
			for(int i = 0; i <= this.getVolume(); i+=10) {
				System.out.print(" |");
			}
			System.out.println("");
		}else {
			System.out.println("TV está desligada!");
		}
	}

	@Override
	public void fecharMenu() {
		if(this.getLigado()) {
			System.out.println("Fechando MENU...");
		}else {
			System.out.println("TV está desligada!");
		}
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("Impossível aumentar volume, a TV está desligada!");
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Impossível diminuir volume, a TV está desligada!!");
		}
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}else {
			System.out.println("TV está desligada ou o volume já está no zero!");
		}
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}else {
			System.out.println("TV está desligada ou o volume já está no zero!");
		}
	}

	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}else {
			System.out.println("Impossível reproduzir, a TV está desligada!!");
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Impossível pausar, a TV está desligada!!");
		}
	}	
}
