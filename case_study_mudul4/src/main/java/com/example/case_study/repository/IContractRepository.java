package com.example.case_study.repository;

import com.example.case_study.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractRepository extends JpaRepository<Contract, Integer> {
    @Query(value = "select ct.* from contract ct                \n" +
            "join customer c on ct.id=c.id                \n" +
            "join facility fa on ct.id=fa.id     \n" +
            " join contract_detail dct on dct.id = ct.id               \n" +
            " join attach_facility afa on dct.id = afa.id              \n" +
            " where c.`name` like :searchName \n" +
            " group by c.id , fa.id",
            nativeQuery = true, countQuery =
            "select ct.* from contract ct                \n" +
                    "join customer c on ct.id=c.id                \n" +
                    "join facility fa on ct.id=fa.id     \n" +
                    " join contract_detail dct on dct.id = ct.id               \n" +
                    " join attach_facility afa on dct.id = afa.id              \n" +
                    " where c.`name` like :searchName \n" +
                    " group by c.id , fa.id"
    )
    Page<Contract> findAllContract(String searchName, Pageable pageable);

}
