package com.example.case_study.repository.facility;

import com.example.case_study.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IFacilityRepository extends JpaRepository<Facility, Integer> {
    @Modifying
    @Query(value = "update facility set status = 1 where id = :id", nativeQuery = true)
    void deleteFacility(@Param("id") Integer id);


    @Query(value =
            "select * from facility where status=0 and `name` like :searchName"
            , nativeQuery = true,
            countQuery = "select count(*) from (select * from facility where `name` like :searchName) facility_name ")
    Page<Facility> findAllFacility(String searchName, Pageable pageable);

}
