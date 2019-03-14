package co.com.alkosto.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.alkosto.userinterfaces.AlkostoHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class WaitToCloseAdvertisingPage implements Task {
	

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		actor.attemptsTo(WaitUntil.the(AlkostoHomePage.BUTTON_CLOSE_IMAGE, isVisible()));
		
	}
	
public static WaitToCloseAdvertisingPage to() {
		
		return instrumented(WaitToCloseAdvertisingPage.class);
		
	}

}
