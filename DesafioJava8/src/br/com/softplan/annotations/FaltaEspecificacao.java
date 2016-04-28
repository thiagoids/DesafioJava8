package br.com.softplan.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE_PARAMETER, ElementType.METHOD })
public @interface FaltaEspecificacao {
	String value() default "Falta especificar";
}
