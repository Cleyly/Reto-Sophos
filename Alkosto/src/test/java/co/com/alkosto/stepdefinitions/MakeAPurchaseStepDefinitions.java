package co.com.alkosto.stepdefinitions;


import org.openqa.selenium.WebDriver;

import co.com.alkosto.tasks.AddProductToCart;
import co.com.alkosto.tasks.OpenTheBrowser;
import co.com.alkosto.tasks.SearchProduct;
import co.com.alkosto.tasks.WaitToCloseAdvertisingPage;
import co.com.alkosto.userinterfaces.AlkostoHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;


public class MakeAPurchaseStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor Cleyly = Actor.named("Cleyly");
	
	private AlkostoHomePage alkostoHomePage;
	
	@Before
	public void setUp() {
		
		Cleyly.can(BrowseTheWeb.with(herBrowser));
		//Cleyly.wasAbleTo(WaitToCloseAdvertisingPage.to());
		
	}
	
	@Given("^the customer enters the app$")
	public void theCustomerWantsToBuyAProduct() {
		Cleyly.wasAbleTo(OpenTheBrowser.on(alkostoHomePage));
		

	}

	@When("^she add '(.*)' to the shopping cart$")
	public void sheSearchTheProductAddsTheProductToTheShoppingCart(String product) {
		Cleyly.attemptsTo(SearchProduct.on(product));
		Cleyly.attemptsTo(AddProductToCart.to());

	}

	@Then("she should see '(.*)' '(.*)' in the shopping cart")
	public void heShouldSeeTheProductInTheShoppingCart(int cantidad,String product) {
				
		
	}
}
