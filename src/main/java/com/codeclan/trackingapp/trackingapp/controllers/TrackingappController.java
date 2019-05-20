package com.codeclan.trackingapp.trackingapp.controllers;

import com.codeclan.trackingapp.trackingapp.models.Employee;
import com.codeclan.trackingapp.trackingapp.repositories.TrackingappRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class TrackingappController {
    @Autowired
    TrackingappRepository trackingappRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return trackingappRepository.findAll();
    }

    @GetMapping("/{id}")
        public Optional<Employee> getEmployee (@PathVariable Long id){
            return trackingappRepository.findById(id);
        }
    }


