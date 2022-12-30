package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.ConstructorGreetingService;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;

public class SetterInjectedControllerTest extends TestCase {

	SetterInjectedController controller;

	@BeforeEach
	public void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}

	public void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}
}
