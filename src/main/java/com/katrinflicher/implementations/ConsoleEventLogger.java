package com.katrinflicher.implementations;

import com.katrinflicher.interfaces.EventLogger;

public class ConsoleEventLogger implements EventLogger {
    public ConsoleEventLogger() {
    }

    public void logEvent(String msg) {
        System.out.println(msg);
    }
}
