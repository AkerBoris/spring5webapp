package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.ConstructorGreetingService;
import junit.framework.TestCase;
import org.junit.Before;

public class ConstructorInjectedControllerTest extends TestCase {

	ConstructorInjectedController controller;

	@Before
	public void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	public void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}
}
