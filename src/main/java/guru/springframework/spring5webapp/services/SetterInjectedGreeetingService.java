/*
 * Author : Adnovum Informatik AG
 */

package guru.springframework.spring5webapp.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreeetingService implements GreetingService{
	@Override
	public String sayGreeting() {
		return "Hello World - Setter";
	}

}
