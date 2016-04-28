package br.com.softplan.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Livro {

	private Optional<Autor> autor;

	public Optional<Autor> getAutor() {
		return autor;
	}

	public static List<Livro> getLivros() {
		List<Livro> livros = new ArrayList<>();

		Livro l1 = new Livro();
		Livro l2 = new Livro();
		Livro l3 = new Livro();

		l1.autor = Optional.of(new Autor("Thiago"));
		l2.autor = Optional.ofNullable(null);
		l3.autor = Optional.ofNullable(null);

		livros.add(l1);
		livros.add(l2);
		livros.add(l3);

		return livros;
	}

}
