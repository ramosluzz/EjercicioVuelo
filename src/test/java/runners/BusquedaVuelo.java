package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"co.com.arbusta.capacitacion.EjercicioVuelos.stepdefinitions"}
        

)	
public class BusquedaVuelo {
	
/**1 Pasaremos la ruta del paquete feature
 * 2.pasaremos la ruta del paquete stepdefinitions
 * 3.snippets: estilo al nombrar los metodos 
 * en este caso se verian con miniscula inicial, seguido de una  Mayuscula.
 * 
 * */
}

