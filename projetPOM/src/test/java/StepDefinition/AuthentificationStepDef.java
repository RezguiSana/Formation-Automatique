package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDef {
	WebDriver driver =SetUp.driver ;
	PageObject.PageAuthentification login2 = New PageAuthentification (driver);

@Given("je veux ouvrire URL {string}")
public void je_veux_ouvrire_url(String string) {
	login2.ouvrirURL(string);
    
}

@When("je veux saisir le user {string}")
public void je_veux_saisir_le_user(String string) {
	login2.saisirPass(string);
   
}

@When("je veux saisir le mot de passe {string}")
public void je_veux_saisir_le_mot_de_passe(String string) {
	login2.saisirPass(string);
    
}

@When("je veux cliquer sur le bouton login")
public void je_veux_cliquer_sur_le_bouton_login() {
	login2.cliqueLogin();
    
}

@Then("je dois verifier le nom de profil {string}")
public void je_dois_verifier_le_nom_de_profil(String string) {
    
}

}
