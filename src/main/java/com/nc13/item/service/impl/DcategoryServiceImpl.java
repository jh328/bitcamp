package com.nc13.item.service.impl;

import com.nc13.item.model.repository.DcategoryRepository;
import com.nc13.item.service.DcategoryService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class DcategoryServiceImpl implements DcategoryService {

    private final DcategoryRepository DCATEGORYREPOSITORY;


}

