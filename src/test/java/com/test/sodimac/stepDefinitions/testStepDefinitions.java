package com.test.sodimac.stepDefinitions;

import com.test.sodimac.steps.homePageSteps;
import com.test.sodimac.steps.productPageSteps;
import com.test.sodimac.steps.resultsPageSteps;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testStepDefinitions {

    public static final Logger LOGGER = LoggerFactory.getLogger(testStepDefinitions.class);

    @Steps
    homePageSteps homePageSteps;
    @Steps
    resultsPageSteps resultsPageSteps;
    @Steps
    productPageSteps productPageSteps;

    private String precio;

    @Before
    public void setPlatform() {
        String platform =  System.getProperty("testPlatform");
        LOGGER.info("The platform is " + platform);
    }

    @Given("^Que me encuentro en la página inicial de sodimac$")
    public void validarPaginaHome(){
        homePageSteps.navegoALaHome("https://www.sodimac.cl/sodimac-cl/");
        homePageSteps.closePopUp();
        homePageSteps.isDisplayedSearchField();
    }

    @And("Busco el producto {string}")
    public void buscoElProducto(String texto) {
        homePageSteps.typeSearchField(texto);
    }

    @Then("Valido que se ve el precio del primer item de la lista")
    public void validoElPrecioDelPrimerItemDeLaLista() {
        resultsPageSteps.isDisplayedFirstResultPrice();
    }

    @And("Hago tap en el boton para completar la búsqueda")
    public void hagoTapEnElBotonParaCompletarLaBúsqueda() {
        homePageSteps.tapSearchButton();
    }

    @Given("Entro al detalle del primer elemento del listado")
    public void entroAlDetalleDelPrimerElementoDelListado() {
        resultsPageSteps.tapFirstResult();
    }

    @Given("Guardo el precio del producto")
    public void guardoElPrecioDelProducto() {
        precio = resultsPageSteps.getFirstResultText();
        LOGGER.info(precio);
    }

    @Then("Valido el precio mostrado en el detalle")
    public void elPrecioMostradoEnElDetalleEs() {
        productPageSteps.isDisplayedWithTextFirstResultPrice(precio);
    }
}
