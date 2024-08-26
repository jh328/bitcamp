package com.nc13.item.controller;

import com.nc13.item.model.domain.ItemModel;
import com.nc13.item.model.entity.ItemEntity;
import com.nc13.item.service.impl.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@Controller
@RestController
@RequestMapping("/itmes")
public class ItemController {


    public List<ItemModel> findAll() {
        return List.of();
    }


    public ItemEntity save(ItemModel item) {
        return null;
    }


    public Optional<ItemModel> findById(Long id) {
        return Optional.empty();
    }


    public void deleteById(Long id) {

    }


    public boolean existsById(Long id) {
        return false;
    }
}
