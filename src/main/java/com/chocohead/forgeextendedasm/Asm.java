package com.chocohead.forgeextendedasm;

import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(CLASS)
@Target({ ElementType.TYPE })
public @interface Asm {

}
