package Q3;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
    int sequence() default 0;
}
class test{
    private int pin;
    public test(int pin){
        this.pin=pin;
    }
    @Execute(sequence=1)
    public static void run(){
    }
    @Execute(sequence=2)
    public static void run2(){
    }
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test s= new test(56);
        Class t=s.getClass();
        Annotation a=t.getAnnotation(Execute.class);
        Execute x=(Execute)a;
        System.out.println(x.sequence());
	}

}
