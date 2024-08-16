package com.dorin.dorin.repository;


import com.dorin.dorin.entities.UtilajDTO;
import com.dorin.dorin.model.Utilaj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilajRepository extends JpaRepository<Utilaj,Integer> {
    @Query("SELECT new com.dorin.dorin.entities.UtilajDTO(u.id, u.numeUtilaj, u.motor) FROM Utilaj u")
    List<UtilajDTO> getUtilajForTable();
}
