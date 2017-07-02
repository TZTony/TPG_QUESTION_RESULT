package au.com.tpg.test.question3;

/**
 * the object used for recording the running time of the method
 * @author Tony Tian
 *
 */
public class TimingLog {
	private long startTime = 0l;
	public TimingLog() {
	}
	
	public void beforeRun(String functionName) {
		this.startTime = System.currentTimeMillis();
	}
	
	public void afterRun(String functionName) {
		long runnintTime =  System.currentTimeMillis() - startTime;
		System.out.printf("[Timing Log] Function %s has completed, running %s in millseconds %n", functionName, runnintTime );
	}
}
