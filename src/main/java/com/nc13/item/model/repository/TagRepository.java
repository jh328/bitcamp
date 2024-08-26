package com.nc13.item.model.repository;

import com.nc13.item.model.domain.TagModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TagRepository extends JpaRepository<TagModel, Long> {
}
