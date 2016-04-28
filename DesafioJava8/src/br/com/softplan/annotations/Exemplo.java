package br.com.softplan.annotations;

public class Exemplo<@FaltaEspecificacao("esperando especificação do arquiteto") T> {

	private @NaoNulo T codigo;

	@EmDesenvolvimento("falta definir qual marca da impressora")
	public T getCodigo() {
		return codigo;
	}

	@EmDesenvolvimento("falta definir qual marca da impressora")
	@EmDesenvolvimento("falta definir qual modelo da impressora")
	@EmDesenvolvimento("outro exemplo")
	public void imprimir(String marcaImpressora, String modeloImpressora) {

	}

}
