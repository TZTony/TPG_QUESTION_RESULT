package au.com.tpg.test.question1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Question 1, it is used for validate a list of IP address loaded from a file "iplist.text" under the class root path, 
 * run main class to print all valid IP address in console 
 * @author Tony Tian
 *
 */
public class IPValidationRegex {
	private static final String VALID_IP_ADDRESS_PATTERN = "(((2[0-4]\\d)|(25[0-5])|(1\\d\\d)|(0?\\d\\d)|(0?0?\\d))\\.){3}((2[0-4]\\d)|(25[0-5])|(1\\d\\d)|(0?\\d\\d)|(0?0?\\d))";
	private static final Charset CHARSET_UTF8 =  Charset.forName("UTF-8");
	
	/**
	 * Main running method
	 * @param args
	 */
	public static void main(String[] args) {
		IPValidationRegex ipValidator = new IPValidationRegex();
		try {
			List<String> validIpList = ipValidator.filterIpAddress("iplist.txt");
			if (validIpList.size() > 0) {
				validIpList.forEach(ip-> System.out.println(ip));
			} else {
				System.out.println("No valid IP address in the file");
			}
		} catch (IOException | URISyntaxException e) {
			System.out.printf("Loading IP List File Error: %s %n ",e.getMessage());
		}
	}
	
	/**
	 * Filter and return a list of valid IP address from a file
	 * @param filePath the file path based on class root path
	 * @return a string list contains all valid IP address
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public List<String> filterIpAddress(String filePath) throws IOException, URISyntaxException {
		List<String> validIpList = new ArrayList<String>();
		List<String> ipList = this.readIpAddressFile(filePath);
		ipList.forEach(ip -> {
			boolean match = ip.matches(VALID_IP_ADDRESS_PATTERN);
			if (match) {
				validIpList.add(ip);
			}
		});
		return validIpList;
	}
	
	/**
	 * Load file and insert line by line into a list of string
	 * @param filePath the file name and path based on class root path
	 * @return a list of string contains all lines in the file
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	private List<String> readIpAddressFile(String filePath) throws IOException, URISyntaxException {
		URL url = ClassLoader.getSystemResource(filePath);
		Path path = Paths.get(url.toURI());
		List<String> ipList = Files.readAllLines(path, CHARSET_UTF8);
		return ipList;
	}
}
