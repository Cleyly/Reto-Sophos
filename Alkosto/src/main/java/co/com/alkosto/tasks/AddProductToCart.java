package co.com.alkosto.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class AddProductToCart implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
	}
	
public static AddProductToCart to() {
		
		return instrumented(AddProductToCart.class);
	}


}
