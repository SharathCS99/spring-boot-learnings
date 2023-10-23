package com.example.trials;

import com.example.trials.search.BinarySearch;
import com.example.trials.sortalgo.MergeSort;
import com.example.trials.sortalgo.QuickSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrialsApplication.class, args);
		BinarySearch bs=new BinarySearch(new QuickSort());
		System.out.println(bs.search((new Comparable[]{4, 3, 21, 1, 2, 0}),1,5));

	}

}
