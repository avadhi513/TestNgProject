package org.testing;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class IAnnot implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		
		IRetryAnalyzer analyzer = arg0.getRetryAnalyzer();
		
		
	}
	
	

}
