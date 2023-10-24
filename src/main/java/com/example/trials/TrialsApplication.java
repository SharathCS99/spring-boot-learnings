package com.example.trials;

import com.example.trials.search.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TrialsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(TrialsApplication.class, args);
		BinarySearch bs=applicationContext.getBean(BinarySearch.class);
		BinarySearch bs1=applicationContext.getBean(BinarySearch.class);
		System.out.println(bs+" "+bs1);
		System.out.println(bs.search((new Comparable[]{4, 3, 21, 1, 2, 0}),1,5));

	}

}
