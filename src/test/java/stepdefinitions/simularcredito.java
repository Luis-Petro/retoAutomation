package stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.Verificar;
import tasks.*;
import util.Utilidades;

public class simularcredito {

      Utilidades utilidad = new Utilidades();

    @Before
    public void  setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Que Luis ingresa al portal$")
    public void que_Luis_ingresa_al_portal() {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage());
    }

    @Dado("^Seleciona productos y servicios para dirigirse a Leasing$")
    public void seleciona_productos_y_servicios_para_dirigirse_a_Leasing() {
        OnStage.theActorInTheSpotlight().attemptsTo(Clicks.onThePage());
    }

    @Dado("^Selecciona Leasing habitacional$")
    public void selecciona_Leasing_habitacional()  {

    }

    @Cuando("^Cuando selecciona simular para dirigirse a segun valor de vivienda$")
    public void cuando_selecciona_simular_para_dirigirse_a_segun_valor_de_vivienda() {

    }

    @Y("^Diligencia los campos del formulario con datos validos \"([^\"]*)\" \"([^\"]*)\"$")
    public void diligenciaLosCamposDelFormularioConDatosValidos(String valor, String plazo)  {
        OnStage.theActorInTheSpotlight().attemptsTo(FillForm.onThePage(valor,plazo));
    }


    @Entonces("^Verifica que al simular su credito obtiene el resultado de la simulacion$")
    public void verifica_que_al_simular_su_credito_obtiene_el_resultado_de_la_simulacion()  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resutlado(), Matchers.equalTo("Cuota fija en pesos")));
    }



}
