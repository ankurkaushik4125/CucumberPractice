package stepDefination;

import implementation.Product;
import implementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep {
	
	Product product;
    Search search;
@Given("I have a search field on Amazon page")
public void i_have_a_search_field_on_amazon_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Step 1  : i am on search page");
   // throw new io.cucumber.java.PendingException();
}

@When("I search for a product with name {string} and price {int}")
public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Step 2 : search for a product with name : "+productName +"and price is : "+price);
	//throw new io.cucumber.java.PendingException();
	
	product = new Product(productName,price);
}

@Then("Product with name {string} should be displayed")
public void product_with_name_should_be_displayed(String productName) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Step 3 : found a product with name : " +productName);
	//throw new io.cucumber.java.PendingException();
	
	search = new Search();
	search.displayProduct(product);
}


}
