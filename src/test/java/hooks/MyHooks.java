package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;


//Note: We can have multiple @Before and @After and those sequence is based on the value of order parameter. In case of @Before lesser the value of order earlier will be the execution In case of @After higher the value of order earlier will be the execution.
//If we don’t define the value order then it takes the default value which is 10000.
//3.	@BeforeStep: This annotation is used to execute before the execution of each step from the scenario.
//4.	@AfterStep: This annotation is used to execute after the execution of each step from the scenario.

//5.	@BeforeAll:  This annotation will execute the method prior to the execution of anything from any of the feature files.
//6.	@AfterAll: This annotation will execute the method post to the execution of everything from features file.
//Note: @BeforeAll and @AfterAll methods must be static otherwise they throw an exception.
//Order parameter can also be used along with @BeforeAll and @AfterAll.


//Note: Hooks are not the part of scenario but background keyword’s step is the part of scenario. So if we try to implement Background and Hooks then Hook will execute first if we have @Before available post that as a part of scenario Background keyword will execute.

//Integration of Hooks with Tags: We can integrate / associate a tag with the hook method which will result in the execution of the hook only when the associated tags scenario is getting executed.

//Note: Whenever we have both tags and order are applicable then we have to use value as a parameter to define the expression for tags in hooks.

//We can use Boolean operators as well to define the condition of tags e.g. "@sanity or @regression"
// If any tag is attached to any hook then it will execute only for that tag. If tag is not applied then it will execute for all


public class MyHooks {
	
	@Before (value="@sanity",order=10)
	public void beforeHook1() {
		System.out.println("before hook1 is executing");
	}

	@After (order=10)
	public void afterHook1() {
		System.out.println("After hook 1 is executing");
	}
	
	@Before (order=5)
	public void beforeHook2() {
		System.out.println("before hook2 is executing");
	}
	
	@After (value="@regression")
	public void afterHook2() {
		System.out.println("After hook 2 is executing");
	}
	
	@BeforeStep (order=5)
	public void beforeStep1() {
		System.out.println("BeforeStep 1 is executing");
		
	}
	
	@AfterStep (order=5)
	public void afterStep1() {
		System.out.println("AfterStep 1 is executing");
		
	}
	
	@BeforeStep (order=10)
	public void beforeStep2() {
		System.out.println("BeforeStep 2 executing");
	}
	
	@AfterStep (order=10)
	public void afterStep2() {
		System.out.println("AfterStep 2 is executing");
	}
	
	
	@BeforeAll(order=1)
	public static void beforeAll() {
		System.out.println("Before all1 is executing");
	}
	
	@BeforeAll(order=2)
	public static void beforeAll2() {
		System.out.println("Before all2 is executing");
	}
	
	
	@AfterAll (order=1)
	public static void afterAll() 
	{System.out.println("After all1 is executing");
	}
	
	
	@AfterAll (order=2)
	public static void afterAll2() 
	{System.out.println("After all2 is executing");
	}
	
	
}
