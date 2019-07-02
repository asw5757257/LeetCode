package leetcode;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class IpTest {

	public static void main(String[] args) throws UnknownHostException {
		Inet4Address address = (Inet4Address) Inet4Address.getLocalHost();
		System.out.println(address.getHostAddress());
		System.out.println(address.getHostName());
		Inet4Address address2 = (Inet4Address) Inet4Address.getByName("www.baidu.com");
		System.out.println(address2.getHostAddress());
		System.out.println(address2.getHostName());

	}

}
