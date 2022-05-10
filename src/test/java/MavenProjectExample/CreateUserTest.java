package MavenProjectExample;

import org.testng.annotations.Test;

public class CreateUserTest
{
	@Test(groups="smoke")
	public void createUser()
	{
		System.out.println("job done after changes did");
		System.out.println("Create User test Pass");
	}
}
