package spring_mvc_demo_java_config_package_validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	// define the attributes that we can pass to our annotation
	
	// define default course code
	public String[] value() default {"LUV"};
	
	// define default error message
	public String message() default "must start with LUV";
	
	// define default groups
	/*  
	  	This is where you can group validation constraints together
	 	But we're not going to use any grouping of grouping constraints
	 	So we'll simply just give the basic boilerplate here of groups 
	 	and we'll simply just give an empty collection. 
	 */
	public Class<?>[] groups() default {};
	
	// define default payload
	// This is where you can give additional information about 
	// the validation error that occured.
	// But we're not going to use any payloads, 
	// so we'll simply just give the default
	public Class<? extends Payload>[] payload() default{};
}
