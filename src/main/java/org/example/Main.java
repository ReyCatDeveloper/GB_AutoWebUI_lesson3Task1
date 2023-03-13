package org.example;

import static org.example.ProjectOperation.authorization;
import static org.example.ProjectOperation.logOut;
import static org.example.WebDriver.ProjectWebDriver.webDriverStart;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //запуск
        webDriverStart("https://www.russianfood.com");
        //авторизация
        authorization();
        //ожидание
        Thread.sleep(2000);
        //разлогин
        logOut();
    }
}