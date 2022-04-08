package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import tasks.Clicks;
import userinterface.LeasingBancolombia;

public class Verificar implements Question {

    public static Verificar resutlado() {
        return new Verificar();
    }


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(LeasingBancolombia.RESULTADO_SIMULACION).viewedBy(actor).asString();
    }
}
