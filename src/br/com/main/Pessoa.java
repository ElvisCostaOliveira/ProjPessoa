package br.com.main;

class Pessoa {
	private String nome;
	private String profissao;
	private int idade;
	private String EstadoCivil;
	private String Data;
	private String CPF;
	private String RG;

	public Pessoa(String nome, String profissao, int idade, String estadoCivil, String data, String cPF, String rG) {
		this.nome = nome;
		this.profissao = profissao;
		this.idade = idade;
		EstadoCivil = estadoCivil;
		Data = data;
		CPF = cPF;
		RG = rG;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", profissao=" + profissao + ", idade=" + idade + ", EstadoCivil=" + EstadoCivil
				+ ", Data=" + Data + ", CPF=" + CPF + ", RG=" + RG + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public int getIdade() {
		return idade;
	}

	public String getEstadoCivil() {
		return EstadoCivil;
	}

	public String getData() {
		return Data;
	}

	public String getCPF() {
		return CPF;
	}

	public String getRG() {
		return RG;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setEstadoCivil(String estadoCivil) {
		EstadoCivil = estadoCivil;
	}

	public void setData(String data) {
		Data = data;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public void setRG(String rG) {
		RG = rG;
	}
}
