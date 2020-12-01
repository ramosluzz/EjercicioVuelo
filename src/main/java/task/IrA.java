package task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class IrA implements Task{
	private PageObject pageVuelos;
	
	public IrA(PageObject page) {
		this.pageVuelos= page;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(pageVuelos));
	}
	public static IrA pagina(PageObject page) {
		return Tasks.instrumented(IrA.class, page);
	}
	
}
