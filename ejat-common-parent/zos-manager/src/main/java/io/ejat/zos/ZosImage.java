package io.ejat.zos;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents a zOS Image that has been provisioned for the test
 * 
 * <p>Used to populate a {@link IZosImage} field</p>
 * 
 * @author Michael Baylis
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ZosImage {
	
	/**
	 * The tag of the zOS Image this variable is to be populated with
	 */
	String imageTag() default "PRIMARY";
	
	/**
	 * Capabilities required of this zOS Image, if any.
	 */
	String[] capabilities() default {};
	
	/**
	 * Set a variable prefix to be filled in for this zOS Image
	 * TODO: ****** TO BE SPECED OUT FURTHER  *****
	 */
	String variablePrefix() default "";
}