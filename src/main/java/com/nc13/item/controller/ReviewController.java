package com.nc13.item.controller;


import com.nc13.item.model.repository.ReviewRepository;
import com.nc13.item.service.impl.ReviewServiceImpl;
import com.nc13.item.service.impl.RtagServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/review")
public class ReviewController {

    private final ReviewServiceImpl REVIEWSERVICE;
    private final ReviewRepository REVIEWREPOSITORY;


}
