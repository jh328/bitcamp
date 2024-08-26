package com.nc13.item.service.impl;


import com.nc13.item.model.repository.ReviewRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class ReviewServiceImpl {

    private final ReviewRepository REVIEWREPOSITORY;


}
