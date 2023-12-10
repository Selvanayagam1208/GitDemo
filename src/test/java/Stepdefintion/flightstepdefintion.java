package Stepdefintion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageObject.Flightpage;
import PageObject.Landingpage;
import Utils.DeepInjection;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flightstepdefintion {
	public DeepInjection di;
	public Flightpage flightpage;
	public Landingpage landingpage;

	public flightstepdefintion(DeepInjection di)
	{
		this.di=di;
		this.flightpage=di.pageobjectmanager.getflightpage();
		this.landingpage=di.pageobjectmanager.getlandingpage();
	}
	public void switchtoflight()
	{
		landingpage.link();
		di.genericutils.switchTowindow();
	}
	@When("User fill details of ticket booking")
	public void user_fill_details_of_ticket_booking(List<String> data) throws InterruptedException {
		switchtoflight();
		flightpage.autosuggestion(data.get(0), data.get(0));
		Thread.sleep(2000);
//		flightpage.destination(data.get(1));
//		flightpage.reachplace(data.get(2));
	}
	@When("user clicks the search button")
	public void user_clicks_the_search_button() {
		flightpage.search();
	}
	@Then("User should navigate and verify available flights")
	public void user_should_navigate_and_verify_available_flights() {
		System.out.println(di.genericutils.gettitle());
		Assert.assertFalse(di.genericutils.driver.getTitle().equalsIgnoreCase("greencart"));
	   
	}

}
