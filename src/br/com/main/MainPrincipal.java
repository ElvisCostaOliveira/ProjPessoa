package br.com.main;

import java.util.List;

public class MainPrincipal {

	public static void main(String[] args) {

		Agenda agenda = new Agenda();
		Pessoa pessoa1 = new Pessoa("Elvis", "Marisqueiro", 34, "Casado", "05/08", "123.123.123.23", "12.123.123.12");
		Pessoa pessoa2 = new Pessoa("Carlos", "Profissional do sexo", 24, "Solteira", "05/08", "123.123.123.23",
				"12.123.123.12");

		agenda.adicionarContato(pessoa1);
		agenda.adicionarContato(pessoa2);

		Pessoa resultadoBusca = agenda.buscarPorNome("Elvis");
		if (resultadoBusca != null) {
			System.out.println("Pessoa encontrada: \n" + resultadoBusca.toString());
		} else {
			System.out.println("Pessoa não encontrada.");
		}

		List<Pessoa> pessoasPorProfissao = agenda.buscarPorProfissao("Marisqueiro");
		System.out.println("Pessoas com profissão 'Marisqueiro':");
		for (Pessoa pessoa : pessoasPorProfissao) {
			System.out.println(pessoa.toString());
		}

		System.out.println("Todos os contatos na agenda:");
		agenda.mostrarContatos();
	}
}
