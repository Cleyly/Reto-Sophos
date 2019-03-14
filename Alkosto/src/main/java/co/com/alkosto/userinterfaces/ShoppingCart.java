package co.com.alkosto.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCart extends PageObject {
	
	public static final Target PRODUCT_NAME = Target.the("Field search product").located(By.xpath("//a[@xpath=\"1\"]"));
	public static final Target NUMBER_OF_ITEMS = Target.the("Number of items").located(By.xpath("//option[@selected='selected']"));

}
