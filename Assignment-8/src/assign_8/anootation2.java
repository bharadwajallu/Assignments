package assign_8;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class anootation2 {

	public static void main(String[] args) {
		 
		//ClassDemo demoClass = new ClassDemo();	
		
		Annotation a = ClassDemo.class.getAnnotation(Info.class);
		System.out.println(" "+a);

	}
}


@Target(ElementType.TYPE)
@Retention (RetentionPolicy.RUNTIME)
@interface Info  {
	    int AuthorID();
		String Author()  default "Sanju";
		String supervisor() default "AAA";
		String Date() default "04/11/2021";
		String Time();
		int Version();
		String Description() default "Implimented project";	
	}


@Info(AuthorID = 1, Time = "03pm", Version = 01)
class ClassDemo{
	
	 public void test() {
		System.out.println("hello");
	}
	
}