package br.com.softplan.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
public @interface NaoNulo {
	String value() default "n�o pode ser nulo";

}
