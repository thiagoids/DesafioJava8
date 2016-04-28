package br.com.softplan.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(PendenciasDesenvolvimento.class)
public @interface EmDesenvolvimento {
	String value();

}
