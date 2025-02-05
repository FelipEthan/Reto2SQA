package org.sqa.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProductCart {
    private String product;

    public AddProductCart(String product) {
        this.product = product;
    }

    public void botonAñadirCarrito(WebDriver driver) {
        WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(text(),'Añadir al carrito')]"));
        addToCartButton.click();
    }
}

