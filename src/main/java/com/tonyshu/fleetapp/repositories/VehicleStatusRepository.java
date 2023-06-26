package com.tonyshu.fleetapp.repositories;

import com.tonyshu.fleetapp.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
