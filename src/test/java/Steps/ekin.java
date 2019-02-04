package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class ekin {
    @When("web link")
    public void webLink() throws Throwable {
      System.out.println("ekin erdogdu");
        throw  new PendingException();
    }
}
