package au.com.tpg.test.question3;

import net.sf.cglib.proxy.Enhancer;

/**
 * Factory for creating a Proxy instance
 * @author Tony Tian
 */
public class TimingFactory {
	private static final TimingMethodInterceptor TIMING_METHOD_INTERCEPTOR = new TimingMethodInterceptor();
	public TimingFactory() {
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getProxyInstance(Class<T> t) {
		Enhancer en = new Enhancer();
		en.setSuperclass(t);
		en.setCallback(TIMING_METHOD_INTERCEPTOR);
		return (T)en.create();
	}

}
