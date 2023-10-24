package com.example.trials.scopes;

import com.example.trials.scopes.connections.PersonDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(ScopeApplication.class, args);
		PersonDAO personDAO=applicationContext.getBean(PersonDAO.class);
		System.out.println(personDAO+" "+personDAO.getJdbcConnection());
		PersonDAO personDAO1=applicationContext.getBean(PersonDAO.class);
		System.out.println(personDAO1+" "+personDAO1.getJdbcConnection());



	}

}