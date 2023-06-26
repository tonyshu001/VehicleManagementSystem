package com.tonyshu.fleetapp.repositories;

import com.tonyshu.fleetapp.models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
