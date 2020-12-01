package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterfaces.ResultadosVuelos;


public class ValidarDisponibilidad implements Question<Boolean>{
	
	public ValidarDisponibilidad() {
		
	}
	@Override
	public Boolean answeredBy(Actor actor) {
		return Text.of(ResultadosVuelos.DISPONIBILIDAD).viewedBy(actor).asBoolean();
	}
	public static ValidarDisponibilidad InfoVuelo() {
		return new ValidarDisponibilidad();
	}
}
