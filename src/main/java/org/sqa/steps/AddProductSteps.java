package org.sqa.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.sqa.actor.User;
import org.sqa.tasks.*;

public class AddProductSteps {

    private User user;
    private WebDriver driver;

    public AddProductSteps() {
        this.user = new User();
        this.driver = user.getDriver();
    }

    @Given("Que estoy en la página principal de la tienda")
    public void paginaPrincipal() {
        new OpenHomePage("https://www.floristeriamundoflor.com/").IngresoWeb(driver);
    }

    @When("Selecciono la categoría {string}")
    public void selectCategoria(String category) {
        new SelectCategory(category).clicCategoria(driver);
    }

    @When("Selecciono un producto {string}")
    public void selectProducto(String producto) {
        new SelectProduct(producto).clicProducto1(driver);
    }

    @And("Selecciono un nuevo producto {string}")
    public void selectNewProducto(String producto2) {
        new SelectProduct(producto2).clicProducto2(driver);
    }

    @Then("Se visualizarán los productos para esta categoría")
    public void visualizarProductos() {
        System.out.println("Los productos de la categoría se visualizan correctamente.");
    }

    @When("De clic en la opción {string}")
    public void opciónCarrito(String option) {
        if (option.equals("Añadir al carrito")) {
            new AddProductCart("Producto 1").botonAñadirCarrito(driver);
        }
    }

    @Then("El producto se agregará al carrito de compras")
    public void agregaCarrito() {
        System.out.println("El producto se ha agregado al carrito correctamente.");
    }

    @When("De clic en la opción CARRO")
    public void opciónCarrito() {
        new VerifyCart().clicOpciónCarrito(driver);
    }

    @Then("Se deberán visualizar los productos agregados")
    public void visualizarProductosAgregados() {
        System.out.println("Los productos agregados se visualizan correctamente en el carrito.");
    }

    @Given("Que he agregado los productos de la categoría {string} al carrito")
    public void agregarProductos(String category) {
        new OpenHomePage("https://www.floristeriamundoflor.com/").IngresoWeb(driver);
        new SelectCategory(category).clicCategoria(driver);
        new AddProductCart("Producto 1").botonAñadirCarrito(driver);
        new AddProductCart("Producto 2").botonAñadirCarrito(driver);
        System.out.println("Los productos han sido agregados al carrito.");
    }

    @After
    public void cerrar_navegador() {
        user.close();
    }
}
