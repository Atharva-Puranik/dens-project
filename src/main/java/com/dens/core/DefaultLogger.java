package com.dens.core;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultLogger {

    private static final Logger logger = LoggerFactory.getLogger("[DensLogger]");

    public static void info(String message) {
        logger.info("[INFO]"+message);
    }

    public static void warn(String message) {
        logger.warn("[WARN]"+message);
    }

    public static void error(String message) {
        logger.error("[ERROR]"+message);
    }
    
    public static void error(String message, Exception e) {
        logger.error("[ERROR]"+message + "\n" + e);
    }

    public static void debug(String message) {
        logger.debug("[DEBUG]"+message);
    }
}
