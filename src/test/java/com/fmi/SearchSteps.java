package com.fmi;

import com.fmi.util.TestConf;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by juan.hernandez on 8/3/17.
 */
public class SearchSteps {

    @Given("^a JIRA search page$")
    public void a_JIRA_search_page() throws Throwable {
        throw new PendingException();
    }

    @When("^I enter the search term \"(.*?)\"Medical Reporting (\\d+)\\.(\\d+)\"(.*?)\"Sprint (\\d+) - Gene U \\((\\d+)/(\\d+)-(\\d+)/(\\d+)\\)\"(.*?)\"$")
    public void i_enter_the_search_term_Medical_Reporting_Sprint_Gene_U(String arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7, int arg8, int arg9, String arg10) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^results should be retrieved$")
    public void results_should_be_retrieved() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}