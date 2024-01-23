package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageAuthentification {
	 
	public static WebDriver driver;
	//creation de constructeur
	public PageAuthentification (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//identification des elements
	@FindBy(how=How.NAME , using="username")
	public static WebElement UserName;
	
	@FindBy (how=How.NAME, using="password")
	public static WebElement MotDePasse ;
	
	@FindBy (how=How.XPATH, using="//button[normalize-space()='Login']")
	public static WebElement Bt_Login;
	
	
  //creation des methode 
	 public void ouvrirURL(String arg) {
		 driver.get(arg); 
	 }
     public void saisirUser(String string) {
    	 UserName.sendKeys(string);
     }
     public void saisirPass(String string) {
    	 MotDePasse.sendKeys(string);
     }
     public void cliqueLogin() {
    	 Bt_Login.click();
     }
}
