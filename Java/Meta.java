import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Myanno {
	String str() default "String";
	int val() default 5;
}

public class Meta {
	
	@Myanno()
	public static void myMeth(Integer val) {
		Meta ob = new Meta();
		//Obtain a Class object for class Meta
		Class<?> c = ob.getClass();
		
		//Obtain a Method object
		try {
			Class<?> in = val.getClass();
			Method m = c.getMethod("myMeth", in);
			Myanno anno = m.getAnnotation(Myanno.class);
			
			System.out.println(anno.str() + " " + anno.val());
		}	catch(NoSuchMethodException e) {
			System.out.println("Method not found.");
		}
			
	}
	public static void main(String args[]) {
		myMeth(12);
	}
}
