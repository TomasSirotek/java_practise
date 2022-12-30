package oop_basics.better_dep_injection;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Target({ FIELD, PARAMETER, METHOD }) // this can be changed for usage
@Retention(RUNTIME)
public @interface CarDAOAnn {}