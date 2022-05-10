package MavenProjectExample;

import org.testng.annotations.Test;

public class ReadingFromCommandLineTest
{
	@Test(groups="smoke")
	
	public void ReadingDataTest()
	{
		String url = System.getProperty("url");
		
		String un = System.getProperty("username");
		String pwd = System.getProperty("password");
		
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		
	}
	
	
	@Test(groups="regression")
	public void regression()
	{
		System.out.println("regression Pass");
		
	}
}
