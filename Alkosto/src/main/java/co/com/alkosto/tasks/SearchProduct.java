package co.com.alkosto.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.alkosto.userinterfaces.AlkostoHomePage;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class SearchProduct implements Task {
	
	private String product;
	
	public SearchProduct(String product) {

		this.product = product;
		
	}


	@Override
	@Step("{0} searches the product")
	public <T extends Actor> void performAs(T actor) {
		
		
		
		actor.attemptsTo(
				Enter.theValue(product).into(AlkostoHomePage.FIELD_SEARCH_PRODUCT));
							
		
	}

	public static SearchProduct on(String product) {
		
		return instrumented(SearchProduct.class, product);
		
	}
}
