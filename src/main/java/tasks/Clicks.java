package tasks;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.LeasingBancolombia;


public class Clicks implements Task {
    public static Clicks onThePage() {
        return Tasks.instrumented(Clicks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LeasingBancolombia.SELECT_MENU_PYS),
                Click.on(LeasingBancolombia.SELECT_MENU_LEASING),
                Click.on(LeasingBancolombia.SELECT_LEASIANG_HABITACIONAL),
                Click.on(LeasingBancolombia.SELECT_SIMULAR),
                Click.on(LeasingBancolombia.SELECT_SEGUN_VALOR_VIVIENDA));
    }
}
