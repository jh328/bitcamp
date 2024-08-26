package com.nc13.item.model.repository;

import com.nc13.item.model.domain.ItemModel;
import com.nc13.item.model.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*이거는 eager을 하는 이유는 시퀀스
* 레이지로 할 수 있는데 애노테이션 레파지토리를 이거로 하는 이유는
* */
@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Long> {



}
