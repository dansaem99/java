package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)//어노테이션 만들기 @써준다.
public @interface Type { 
	String name();
	int value();
}

@Retention(RetentionPolicy.CLASS) //기본값은 class 다.
@Target(ElementType.FIELD)
@interface Field {
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface Constructor {
	int value() default 0;
}

@Target(ElementType.METHOD)
@interface Method {
	
}

@Target(ElementType.PARAMETER)
@interface Param{
	
}

@Target(ElementType.LOCAL_VARIABLE)
@Annotation
@interface Local {
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation {
	
}

@Target({ElementType.TYPE, ElementType.FIELD})
@interface Universal {
	
}