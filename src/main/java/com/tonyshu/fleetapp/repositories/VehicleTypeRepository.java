package com.tonyshu.fleetapp.repositories;

import com.tonyshu.fleetapp.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
