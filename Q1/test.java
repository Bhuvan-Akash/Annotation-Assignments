package Q1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface test{
  int testCaseNo();
}
public class test {
	@Test(testCaseNo = 1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
