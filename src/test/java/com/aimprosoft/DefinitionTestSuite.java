package com.aimprosoft;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {
        //"src/test/resources/features/consult_dictionary/01FirstRegistrationPage.feature",
        //"src/test/resources/features/consult_dictionary/02SecondRegistrationPage.feature",
        //"src/test/resources/features/consult_dictionary/03AuthorizationPage.feature",
        //"src/test/resources/features/consult_dictionary/04PasswordRecovery.feature",
        "src/test/resources/features/consult_dictionary/05MainPage.feature"
})
public class DefinitionTestSuite {
}
