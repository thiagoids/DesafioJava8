package br.com.softplan.optional;

import java.util.List;
import java.util.Optional;

public class ExecutarOptional {

	public static void main(String[] args) {
		List<Livro> colecao = Livro.getLivros();

		for (Livro livro : colecao) {

			Optional<Autor> autor = livro.getAutor();
			System.out.println(
					autor.orElse(new Autor("Nao definido")).getNome()
				);
			// autor.orElseThrow(IllegalArgumentException::new);
		}

	}
}
