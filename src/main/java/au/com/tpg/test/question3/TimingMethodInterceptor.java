package au.com.tpg.test.question3;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * This class implements the CGLIB MethodInterceptor to inject the TimingLog around the method invoke action
 * @author Tony Tian
 */
public class TimingMethodInterceptor implements MethodInterceptor {
	public TimingMethodInterceptor() {
	}

	/**
	 * Using timingLog to record the method invocation start and end time in milliseconds, then calculate the total running time for a method
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		TimingLog timingLog = new TimingLog();
		timingLog.beforeRun(method.getName());
		Object result = proxy.invokeSuper(obj, args);
		timingLog.afterRun(method.getName());
		return result;
	}

}
