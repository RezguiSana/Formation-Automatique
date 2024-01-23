package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageDashBoard {
	
	
	@FindBy(how=How.XPATH, using="//p[@class='oxd-userdropdown-name']")
	public static WebElement Nom_Profil;

}
