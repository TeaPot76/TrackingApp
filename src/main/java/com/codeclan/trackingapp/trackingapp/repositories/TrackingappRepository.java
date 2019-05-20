package com.codeclan.trackingapp.trackingapp.repositories;

import com.codeclan.trackingapp.trackingapp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingappRepository extends JpaRepository<Employee, Long> {

}
