package tasks;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import userinterface.LeasingBancolombia;
import net.thucydides.core.pages.PageObject;


public class FillForm implements Task {
    private  final  String ValorVivivenda;
    private  final String Plazo;
  //



    public FillForm(String valorVivivenda, String plazo) {
        ValorVivivenda = valorVivivenda;
        Plazo = plazo;

    }


    public static FillForm onThePage(String ValorVivienda, String Plazo) {
        return  Tasks.instrumented(FillForm.class, ValorVivienda, Plazo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(ValorVivivenda).into(LeasingBancolombia.INSERT_VALOR_VIVIENDA),
                Enter.theValue(Plazo).into(LeasingBancolombia.INSERT_VALOR_YEARS),
                // Click.on(LeasingBancolombia.PORCENTAJE),
                //Click.on(LeasingBancolombia.SELECT_PORCENTAJE),
/*---------------------INSERTAR FECHA-------------------------------*/
                Click.on(LeasingBancolombia.SELECT_CAMPO_FECHA),
                Click.on(LeasingBancolombia.SELECT_YEAR),
                Click.on(LeasingBancolombia.SELECT_MONTH),
                Click.on(LeasingBancolombia.SELECT_DAY),

                Click.on(LeasingBancolombia.BOTON_SIMULAR),
                Click.on(LeasingBancolombia.LEEASIN_HABITACIONAL)



        );

    }
}
