package org.sqa.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyCart {
    public void clicOpciónCarrito(WebDriver driver) {
        WebElement cartButton = driver.findElement(By.xpath("//a[text()='CARRO']"));
        cartButton.click();
    }
}
