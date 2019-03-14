package co.com.alkosto.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.alkosto.com/")
public class AlkostoHomePage extends PageObject {
	
	public static final Target BUTTON_CLOSE_IMAGE = Target.the("Button close image").located(By.id("img_close_697317362"));
	public static final Target FIELD_SEARCH_PRODUCT = Target.the("Field search product").located(By.id("search"));
	public static final Target BUTTON_SEARCH = Target.the("Button search").located(By.xpath("//button[@id='searchSubmit']"));
	public static final Target RESULT_OF_THE_SEARCH = Target.the("Result of the search").locatedBy("//a[contains(text(),'MacBook Pro MR9U2E/A 256GB TouchBar 13\" Plateado')]");
	public static final Target BUTTON_ADD_TO_CART = Target.the("Button add to cart").located(By.id("Addtocart"));
	public static final Target BUTTON_MY_CART = Target.the("Button my cart").locatedBy("//a[@title='Mi carrito']");

}
