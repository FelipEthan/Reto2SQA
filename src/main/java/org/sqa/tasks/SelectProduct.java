package org.sqa.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectProduct {
    private String producto;
    private String producto2;


    public SelectProduct(String producto) {
        this.producto = producto;
        this.producto2 = producto2;

    }

    public void clicProducto1(WebDriver driver) {
        WebElement productElement = driver.findElement(By.xpath("//body/div[@id='wrapper-container']/div[@id='tbay-main-content']/section[@id='main-container']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h3[1]/a[1]"));
        productElement.click();
    }
    public void clicProducto2(WebDriver driver) {
        WebElement productElement = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[1]/div/div/div[2]/div/div/div[4]/div/div[2]/div/div/h3/a"));
        productElement.click();
    }

}

