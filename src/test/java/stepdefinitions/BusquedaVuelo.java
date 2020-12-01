package stepdefinitions;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import questions.ValidarDisponibilidad;
import task.BuscarVuelo;
import task.IrA;
import userInterfaces.HomeVuelos;
public class BusquedaVuelo {

	@Managed(driver = "chrome")
	public WebDriver driver;
	
	private HomeVuelos page;
	Actor luz = Actor.named("Luz");
	
	@Before
	public void SetUp() {
		luz.can(BrowseTheWeb.with(driver));
	}
	
    @Given("usuario ingresa a la pagina de vuelos")
    public void usuario_ingresa_a_la_pagina_de_vuelos(){
    	luz.can(BrowseTheWeb.with(driver));
		luz.attemptsTo(IrA.pagina(page));
		throw new io.cucumber.java.PendingException();
    }

    @When("usuario busca el vuelo")
    public void usuario_busca_el_vuelo()throws Throwable{
    	luz.attemptsTo((BuscarVuelo.paraDisponibilidad("25", "30")));
    	throw new io.cucumber.java.PendingException();
    }

    @Then("usuario visualiza la busqueda")
    public void usuario_visualiza_la_busqueda(){
    	luz.should(seeThat(ValidarDisponibilidad.InfoVuelo()));
    	throw new io.cucumber.java.PendingException();
    }
}
