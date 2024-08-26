package com.nc13.item.service.impl;

import com.nc13.item.model.domain.ItemModel;
import com.nc13.item.model.entity.ItemEntity;

import java.util.List;
import java.util.Optional;


public interface ItemService {

    List<ItemModel> findAll();
    ItemEntity save(ItemModel item);
    Optional<ItemModel> findById(Long id);
    void deleteById(Long id); // 보이드를 해야 하는지 모르겠음...
    boolean existsById(Long id);


}
