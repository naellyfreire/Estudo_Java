package AulaCurso06;

public class Lutador {
	
	//Atributos
	private String nome, nacionalidade, categoria;	
	private float altura, peso;
	private int idade, vitorias, derrotas, empates;

	//Métodos especiais
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	
	//Metodos Especiais
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Inválido";
		}else if(this.peso <= 70.3) {
			this.categoria = "Leve";
		}else if(this.peso <= 83.9) {
			this.categoria = "Médio";
		}else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
	}
	
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	//Metodos Públicos
	public void apresentar() {
		System.out.println("*****************************************");
		System.out.println("CHEGOU A HORA!!");
		System.out.print("Apresentamos o lutador " +this.getNome());
		System.out.print(", diretamente de " +this.getNacionalidade());
		System.out.print(", com " + this.getIdade() +" anos, " + this.getAltura() +" m de altura");
		System.out.println(" e pesando " +this.getPeso() + " Kg.");
		System.out.println("Ganhou: " +this.getVitorias() +" vezes");
		System.out.println("Perdeu: " +this.getDerrotas() +" vezes");
		System.out.println("Empates: " +this.getEmpates() +" vezes");
		System.out.println();
	}
	
	public void status() {
		System.out.println();
		System.out.println(this.getNome());
		System.out.println("É um peso " +this.getCategoria());
		System.out.print("Com " + this.getVitorias() +" vitórias, ");
		System.out.print(this.getDerrotas() +" derrotas e ");
		System.out.print(this.getEmpates() +" empates");
		System.out.println();
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatar() {
		this.setEmpates(this.getEmpates() + 1);
	}
}