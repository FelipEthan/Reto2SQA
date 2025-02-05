package org.sqa.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectCategory {
    private String category;

    public SelectCategory(String category) {
        this.category = category;
    }

    public void clicCategoria(WebDriver driver) {
        WebElement categoryElement = driver.findElement(By.xpath("//a[text()='" + category + "']"));
        categoryElement.click();
    }
}

