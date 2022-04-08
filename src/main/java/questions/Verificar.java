package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import tasks.Clicks;
import userinterface.LeasingBancolombia;

public class Verificar implements Question {
    LeasingBancolombia Le = new LeasingBancolombia();
    public static Verificar resutlado() {
        return new Verificar();
    }


    @Override
    public Object answeredBy(Actor actor) {
        System.out.printf("VALOR CUOTA FIJA EN PESOS: "+Le.Resultados());
        return Text.of(LeasingBancolombia.RESULTADO_SIMULACION).viewedBy(actor).asString();
    }
}
