package com.nc13.item.service.impl;


import com.nc13.item.model.repository.RtagRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@Transactional
@RequiredArgsConstructor
public class RtagServiceImpl {

    private final RtagRepository RTAGREPOSITORY;


}
