package com.dmdev.spring.database.pool;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ConnectionPool {
    private final String username;
    private final Integer poolSize;

    private final List<String> args;

    private Map<String, String> properties;

    public ConnectionPool(String username, Integer poolSize, List<String> args, Map<String, String> properties) {
        this.username = username;
        this.poolSize = poolSize;
        this.args = args;
        this.properties = properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @PostConstruct
    private void init() {
        System.out.println("Init connection pool");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Clean connection pool");
    }
}
