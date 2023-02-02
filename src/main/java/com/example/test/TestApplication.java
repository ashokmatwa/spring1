package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
//	Create an author and book management system which can help us easily to perform CRUD operations.
//	POST :Add book(been there), add author
// highest no pages
// PUT the (path bookname, updated pages);