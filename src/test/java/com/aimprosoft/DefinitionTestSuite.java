package com.aimprosoft;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {
        //"src/test/resources/features/consult_dictionary/01_RegistrationPage1.feature",
        //"src/test/resources/features/consult_dictionary/02_RegistrationPage2.feature",
        //"src/test/resources/features/consult_dictionary/03_AuthorizationPage.feature",
        //"src/test/resources/features/consult_dictionary/04_PasswordRecoveryPage1.feature",
        //"src/test/resources/features/consult_dictionary/05_PasswordRecoveryPage2.feature",
        //"src/test/resources/features/consult_dictionary/06_MainPage.feature",
        "src/test/resources/features/consult_dictionary/07_UserMenuPage.feature"
})
public class DefinitionTestSuite {
}
