package com.vytrack.step_definitions;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    Pages pages = new Pages();

    @Given("User is on landing page")
    public void user_is_on_landing_page() {
     pages.loginPage().goToLandingPage();
    }

    @Then("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
      pages.loginPage().login(ConfigurationReader.getProperty("storemanagerusername"),ConfigurationReader.getProperty("storemanagerpassword"));
    }



    @Then("User verifies that {string} page name is displayed")
    public void user_verifirs_that_page_name_is_displayed(String string) {
        Assert.assertEquals(string, pages.dashboardPage().getPageSubTitle() );

    }

    @Then("User logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String string, String string2) {
        pages.loginPage().login(string,string2);
    }

    @Then("User verifies that {string} warning message is displayed")
    public void user_verifies_that_warning_message_is_displayed(String string) {
        String actual =  pages.loginPage().getErrorMessage();
        Assert.assertEquals(actual,string);
    }
// this is temporary solution until we start hooks
    @Then("user quits")
    public void user_quits() {
        Driver.closeDriver();
    }



int a  = 100;

    }







