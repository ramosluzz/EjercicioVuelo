package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.viajes.com/es-co/")
public class HomeVuelos extends PageObject {

	public HomeVuelos() {
		
	}
public static final Target txt_origen = Target.the("Input Text Origen").locatedBy("//input[@id='origin-label']");
public static final Target txt_destino = Target.the("Input Text Destino").locatedBy("//input[@id='destination-label']");
public static final Target txt_fechaSalida = Target.the("Input Text Fecha de Salida").locatedBy("//input[@id='reservationtime']");
public static final Target txt_fechaRegreso = Target.the("Input Text Fecha de Regreso").locatedBy("//input[@id='reservationtimeend']");
public static final Target lst_numPasajeros = Target.the("Lista de Num de Pasajeros").locatedBy("passengers-flights");
}
