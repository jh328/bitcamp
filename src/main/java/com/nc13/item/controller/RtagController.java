package com.nc13.item.controller;

import com.nc13.item.service.impl.RtagServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class RtagController {

    private final RtagServiceImpl RTAGSERVICE;



}
