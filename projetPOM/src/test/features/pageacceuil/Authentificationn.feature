@authentificationOrangrHRM
Feature: je veux me connecter
 

  @tag1
  Scenario: je veux me connecter en tant que admin 
    Given je veux ouvrire URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login "
     When je veux saisir le user "Admin "
    And je veux saisir le mot de passe "admin123 "
    And je veux cliquer sur le bouton login 
    Then je dois verifier le nom de profil "Paul Collings"
    
