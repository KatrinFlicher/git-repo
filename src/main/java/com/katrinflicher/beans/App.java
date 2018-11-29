package com.katrinflicher.beans;

import com.katrinflicher.interfaces.EventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    Client client;
    EventLogger consoleEventLogger;

    public App(Client client, EventLogger consoleEventLogger) {
        this.client = client;
        this.consoleEventLogger = consoleEventLogger;
    }

    public App() {
    }


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) context.getBean("app");
        app.logEvent("Some event for user 1");

    }

    public void logEvent(String msg){
        String message = msg.replaceAll(client.getId(),client.getFullName());
        consoleEventLogger.logEvent(message);

    }
}
