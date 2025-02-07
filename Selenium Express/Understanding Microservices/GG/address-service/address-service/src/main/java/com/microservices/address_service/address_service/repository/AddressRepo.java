package com.microservices.address_service.address_service.repository;

import com.microservices.address_service.address_service.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddressRepo extends JpaRepository<Address, Integer> {


    @Query(nativeQuery = true, value = "SELECT a.id, a.lane1, a.lane2, a.state, a.zip FROM mircoservices.employees e join mircoservices.address a on e.id=a.id where a.employee_id=:employeeId")
    Address findAddressByEmployeeId(@Param("employeeId") int employeeId);
}
