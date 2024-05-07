package org.japzio.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface WithTechDebt {
    String severity() default "";
    String effort() default "";
}
