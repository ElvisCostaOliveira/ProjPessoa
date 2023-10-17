package br.com.main;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Pessoa> contatos;

	public Agenda() {
		contatos = new ArrayList<>();
	}

	public void adicionarContato(Pessoa pessoa) {
		contatos.add(pessoa);
	}

	public Pessoa buscarPorNome(String nome) {
		for (Pessoa pessoa : contatos) {
			if (pessoa.getNome().equals(nome)) {
				return pessoa;
			}
		}
		return null;
	}

	public List<Pessoa> buscarPorProfissao(String profissao) {
		List<Pessoa> pessoasComProfissao = new ArrayList<>();
		for (Pessoa pessoa : contatos) {
			if (pessoa.getProfissao().equals(profissao)) {
				pessoasComProfissao.add(pessoa);
			}
		}
		return pessoasComProfissao;
	}

	public void mostrarContatos() {
		for (Pessoa pessoa : contatos) {
			System.out.println(pessoa.toString());
		}
	}
}