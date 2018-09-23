package DependenciesInTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencyintstcases {

@Test
public void startTest()
{
	System.out.println("start");
	Assert.assertEquals(11, 12);
}
@Test(dependsOnMethods="startTest")
public void loggin()
{System.out.println("loggin");
	
}@Test
public void loggout()
{
	System.out.println("loggout");
}
}
