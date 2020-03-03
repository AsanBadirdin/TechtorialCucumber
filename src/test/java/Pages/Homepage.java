package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Homepage {
    public Homepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//ul[@id=‘ctl00_menu’]//li")
    public List<WebElement> orderManu;
    @FindBy(xpath = "(//*[.='View all products'])[2]")
    public WebElement viewAllProducts;

    public List<String> orderMenuData(){
        List<String> menus = new ArrayList();
        menus.add("View all orders");
        menus.add("View all products");
        menus.add("Order");
        return menus;
    }



}
