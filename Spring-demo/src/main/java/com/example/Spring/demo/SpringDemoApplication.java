package com.example.Spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args)
	{
		//by using interface we implement loose coupling
		//ques1 q = new ques1(new BubbleSortAlgo());

		//binary search is using bubble sort to sort, we can also use quick sort,
		// implementation wont be changed

		ques1 q1 = new ques1(new QuickSortAlgo());
		int result= q1.BinarySearch(new int[] {12,7,9,4},3);
		System.out.println(result);

		//ques 4: (4) Get a Spring Bean from application context and display its properties.

		ApplicationContext applicationContext =
		SpringApplication.run(SpringDemoApplication.class, args);

		//from application context, we ge binary search bean.
		ques1 ques = applicationContext.getBean(ques1.class);
	}

}
