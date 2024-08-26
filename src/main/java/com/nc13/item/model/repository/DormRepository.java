package com.nc13.item.model.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DormRepository extends JpaRepository{



    boolean existsByAddress(String address);
}
