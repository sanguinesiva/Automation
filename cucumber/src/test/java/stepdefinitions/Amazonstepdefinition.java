package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazonstepdefinition {
	@Given("user is in the Amazon page")
	public void user_is_in_the_amazon_page() {
	
	}

	@When("user search with \"apple\"and price {string}")
	public void user_search_with_apple_and_price(String string) {
			 
	}

	@Then("the result displayed")
	public void the_result_displayed() {
	 
	}

	@When("user search with \"samsung\"and price {string}")
	public void user_search_with_samsung_and_price(String string) {
	
	}
	@When("user search with \"Apple\"and price {string}")
	public void user_search_with_apple_and_price1(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@When("user search with the following details")
	public void user_search_with_the_following_details(io.cucumber.datatable.DataTable dataTable) {

		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	
	
	}


}
