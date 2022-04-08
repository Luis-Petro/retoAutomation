package userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("https://www.bancolombia.com/personas/creditos")
public class LeasingBancolombia extends PageObject {

  public String Resultados(){

    String v1 =  getDriver().findElement(org.openqa.selenium.By.id("resultado-FIXEDRATEFIXEDFEE")).getText();
   // String v2 = getDriver().findElement(org.openqa.selenium.By.xpath("//div//small[@class='very-small']")).getText();
      return v1;
  }


    //-------------------------------NAVIGATION--------------------------------------

    public static final Target SELECT_MENU_PYS =Target.the("Menu productos y servicio").
            located(By.id("menu-productos"));
    public static final Target SELECT_MENU_LEASING =Target.the("Leasing").
            located(By.id("header-productos-leasing"));
    public static final Target SELECT_LEASIANG_HABITACIONAL = Target.the("Leansing Habitacional").
            located(By.xpath("//a[contains(text(), 'Leasing Habitacional')]"));
    public static final Target SELECT_SIMULAR = Target.the("SIMULAR").
            located(By.xpath("//a[contains(text(), 'Simula')]"));
    public static final Target SELECT_SEGUN_VALOR_VIVIENDA = Target.the("Según Valor De Vivivenda").
            located(By.id("calcular-cuotas"));

    //---------------------------------FORM-----------------------------------------------

    public static final Target INSERT_VALOR_VIVIENDA = Target.the("Valor de vivienda").
            located(By.id("valor-simulacion"));
    public static final Target INSERT_VALOR_YEARS = Target.the("Plazo del crédito").
            located(By.id("valor-year"));
    public static final Target SELECT_CAMPO_FECHA = Target.the("Selecionar entrada año de nacimiento").
            located(By.id("campo-fecha")) ;
    public static final Target SELECT_YEAR = Target.the("Año").
            located(By.xpath("//div[contains(text(), '1994')]"));
    public static final Target SELECT_MONTH = Target.the("Mes").
            located(By.xpath("//div[contains(text(), 'DIC')]"));
    public static final Target SELECT_DAY = Target.the("Dia").
            located(By.xpath("//div[contains(text(), '15')]"));
    public static final Target BOTON_SIMULAR = Target.the("Boton simular").
            located(By.id("boton-simular"))  ;
    public static final Target LEEASIN_HABITACIONAL =  Target.the("Leasing Habitacional").
            located(By.xpath("//div[contains(text(), 'Leasing Habitacional')]"))  ;
    /*
    public static final Target PORCENTAJE = Target.the("Leasing").
            located(By.xpath("//span[contains(text(), '70%')]")) ;
    public static final Target SELECT_PORCENTAJE = Target.the("Leasing").
            located(By.xpath("//span[contains(text(), '80%')]")) ; */

    //----------------------------------------RESULTS-----------------------------------------------------
    public static final Target RESULTADO_SIMULACION =  Target.the("Resultado").
            located(By.xpath("//h6[contains(text(), 'Cuota fija en pesos')]"))  ;
}

