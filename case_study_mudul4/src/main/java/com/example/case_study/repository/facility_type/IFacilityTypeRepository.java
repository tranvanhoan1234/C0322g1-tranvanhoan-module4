package com.example.case_study.repository.facility_type;

import com.example.case_study.model.facility.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacilityTypeRepository extends JpaRepository<FacilityType,Integer> {
}
