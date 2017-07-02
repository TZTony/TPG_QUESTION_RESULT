package au.com.tpg.test.question3;

/**
 * Method wrapper used for defining the method running before and after invoking method 
 * @author Tony Tian
 */
public interface MethodWrapper {
	void beforeRun(String functionName);
	void afterRun(String functionName);
}
