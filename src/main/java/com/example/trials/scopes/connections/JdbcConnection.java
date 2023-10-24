package com.example.trials.scopes.connections;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {

    public JdbcConnection()
    {
        System.out.println("Jdbc connection established");
    }
}
