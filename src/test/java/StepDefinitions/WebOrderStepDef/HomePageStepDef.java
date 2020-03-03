package StepDefinitions.WebOrderStepDef;

import Pages.Homepage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePageStepDef {
   Homepage page = new Homepage();
    @Then("the user should see order menu list")
    public void the_user_should_see_order_menu_list() {
        //
        List<String> ecpected=page.orderMenuData();
        List<String> actual=new ArrayList<>();
        for (WebElement element:page.orderManu){
            actual.add(element.getText());
        }
        for (int i = 0; i<actual.size();i++){
            Assert.assertEquals(ecpected.get(i),actual.get(i));
        }
    }
}
