package com.nc13.item.service.impl;

import com.nc13.item.model.repository.AmenityRepository;
import com.nc13.item.service.AmenityService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class AmenityServiceImpl implements AmenityService {

    private final AmenityRepository AMENITYREPOSITORY;


}

