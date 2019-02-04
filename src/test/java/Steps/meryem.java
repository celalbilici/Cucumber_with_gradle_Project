package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class meryem {
    @When("appium calis")
    public void appiumCalis() throws Throwable {
        System.out.println("meryem");
        throw new PendingException();
    }
}
