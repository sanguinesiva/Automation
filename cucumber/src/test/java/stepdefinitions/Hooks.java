package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@loginScenario")
	public void beforevalidation() {
		System.out.println("before");
		
	}
	@After("@loginScenario")
	public void aftervalidation() {
		System.out.println("after");
		
	}
}
