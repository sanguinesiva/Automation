package stepdefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImdbScenarioOutline {
	@Given("i want to enter  sanguinesiva@gmail.com")
	public void i_want_to_enter_sanguinesiva_gmail_com() {

	}

	@When("I check for the Monkey@{int} in step")
	public void i_check_for_the_monkey_in_step(Integer int1) {
	
	}

	@Then("I verify the pass in step")
	public void i_verify_the_pass_in_step(DataTable table) {
//	List<List<String>>userList=	table.asList(String.class);
//	for(List<String>eList)
	
	}  

	@Given("i want to enter  duplicate@emailid.com")
	public void i_want_to_enter_duplicate_emailid_com() {
		
	}

	@When("I check for the duplicate in step")
	public void i_check_for_the_duplicate_in_step() {
	
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {

	}

}
