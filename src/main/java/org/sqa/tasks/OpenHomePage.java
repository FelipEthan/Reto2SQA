package org.sqa.tasks;
import org.openqa.selenium.WebDriver;

public class OpenHomePage {
    private String url;

    public OpenHomePage(String url) {
        this.url = url;
    }

    public void IngresoWeb(WebDriver driver) {
        driver.get(url);
    }
}
