package com.github.randomcodeorg.ppplugin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface RunAfter {

	Class<? extends PProcessor>[] value();
	
}
