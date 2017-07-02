package au.com.tpg.test.question3;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import au.com.tpg.test.question1.IPValidationRegex;

/**
 * This class is the main running class for start testing TimingFactory framework for calculate the running time
 * There are a test in main method, using the Question1 IPValidationRegex as an example, print out the running time and valid IP list
 * @author Tony Tian
 *
 */
public class MethodRunningTimeTest{
	public static void main(String[] args) {
		MethodRunningTimeTest.methodRunningTimeTest();
	}
	
	public static void methodRunningTimeTest() {
		System.out.println("[MethodRunningTimeTest] Running Test 1");
		
		//using IPValidationRegex in question as example
		IPValidationRegex ipValidator = TimingFactory.getProxyInstance(IPValidationRegex.class);
		try {
			List<String> validIpList = ipValidator.filterIpAddress("iplist.txt");
			if (validIpList.size()> 0) {
				validIpList.forEach(ip-> System.out.println("Valid IP: " + ip));
			} else {
				System.out.println("No valid IP address");
			}
		} catch (IOException | URISyntaxException e) {
			System.out.println("Load iplist file exception");
		}
	}
	
}
