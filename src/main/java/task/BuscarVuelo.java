package task;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import userInterfaces.HomeVuelos;

public class BuscarVuelo implements Task{
	
	private String salida = "";
	private String regreso = "";
	
	public BuscarVuelo(String salida, String regreso) {
		this.salida = salida;
		this.regreso = regreso;
	}
	@Step("{0} Buscar disponibilidad del Vuelo")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("El dorado").into(HomeVuelos.txt_origen).thenHit(Keys.ENTER),
				Enter.theValue("Buenos Aires").into(HomeVuelos.txt_destino).thenHit(Keys.ENTER),
				Click.on(HomeVuelos.txt_fechaSalida),
				Click.on("//a[contains(text(),'"+ salida +"')]"),
				Click.on(HomeVuelos.txt_fechaRegreso),
				Click.on("//a[contains(text(),'"+regreso+"')]"));			
	}
	
	public static BuscarVuelo paraDisponibilidad(String salida, String regreso) {
		return Tasks.instrumented(BuscarVuelo.class, salida, regreso);
	}
}
