package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.ConstructorGreetingService;
import junit.framework.TestCase;

public class PropertyInjectedControllerTest extends TestCase {

	PropertyInjectedController controller;

	@Override
	public void setUp() throws Exception {
		controller = new PropertyInjectedController();

		controller.greetingService = new ConstructorGreetingService();
	}

	public void testGetGreeting() {

		System.out.println(controller.getGreeting());
	}
}
