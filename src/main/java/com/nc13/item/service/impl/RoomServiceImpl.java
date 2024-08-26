package com.nc13.item.service.impl;


import com.nc13.item.model.repository.RoomRepository;
import com.nc13.item.service.RoomService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class RoomServiceImpl  {

    private final RoomRepository ROOMREPOSITORY;




}
