package TestNgWork;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer {

	public void transform(ITestAnnotation a, Class cl, Constructor con, Method tm) {
		IRetryAnalyzer r = a.getRetryAnalyzer();
		if(r==null) {
			a.setRetryAnalyzer(SampleTestNg.class);
		}
		
	}

}
