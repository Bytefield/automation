package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeStepsDefinition {

    public static WebDriver driver;

    @Given("I am on the home page")
    public void i_navigate_to_the_home_page() {

        driver.get("https://www.google.com/");
    }

    @When("I enter text {string} in input")
    public void iEnterTextCodeboxInInput(String search) {
        WebElement textInput = driver.findElement(By.id("APjFqb"));
        System.out.println(textInput);
//        textInput.clear();
//        textInput.sendKeys(search);
    }

    @And("I click on Google Search button")
    public void iClickOnButton() {
        WebElement submitButton = driver.findElement(By.linkText("Google Search"));
        submitButton.click();
    }

    @Then("I should see the results page")
    public void iShouldSeeTheResultsPage() throws InterruptedException {
        Thread.sleep(2500);
//        Assert.assertEquals(driver.getTitle(), "codebox - Google Search");
    }
}
