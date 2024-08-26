package com.nc13.item.controller;


import com.nc13.item.service.impl.AmenityServiceImpl;
import com.nc13.item.service.impl.DamenityServiceImpl;
import com.nc13.item.service.impl.DormServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class DamenityController {

    private final DamenityServiceImpl DAMENITYSERVICE;
    private final DormServiceImpl DORMSERVICE;
    private final AmenityServiceImpl AMENITYSERVICE;


}
