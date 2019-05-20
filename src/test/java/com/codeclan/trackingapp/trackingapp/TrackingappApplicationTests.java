package com.codeclan.trackingapp.trackingapp;

import com.codeclan.trackingapp.trackingapp.models.Employee;
import com.codeclan.trackingapp.trackingapp.repositories.TrackingappRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrackingappApplicationTests {
@Autowired
	TrackingappRepository trackingappRepository;
	@Test
	public void contextLoads() {
	}
	@Test
	public void createEmployee(){
		Employee employee = new Employee("Ben", 23, 1234, "ben@gmail.com");
		trackingappRepository.save(employee);
	}

}
