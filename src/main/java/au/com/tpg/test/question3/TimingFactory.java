package au.com.tpg.test.question3;

import net.sf.cglib.proxy.Enhancer;

/**
 * Factory for creating a proxy instance
 * @author Tony Tian
 */
public class TimingFactory {
	public TimingFactory() {
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getProxyInstance(Class<T> t, MethodWrapper methodWrapper) {
		Enhancer en = new Enhancer();
		en.setSuperclass(t);
		en.setCallback(new TimingMethodInterceptor(methodWrapper));
		return (T)en.create();
	}

}
