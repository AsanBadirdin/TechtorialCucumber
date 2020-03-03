package StepDefinitions.WebOrderStepDef;

import Pages.AllProductPage;
import Pages.Homepage;
import io.cucumber.java.en.Then;

public class AllProductsStepDef {
    Homepage page = new Homepage();
    AllProductPage allProductPage = new AllProductPage();
    @Then("the user click view all products menu")
    public void the_user_click_view_all_products_menu(){
    }

    @Then("the user validates the products table")
    public void the_user_validates_the_products_table() {

    }


}
