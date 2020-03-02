package com.databaserelationship.dbrelationonetomany.controller;

import com.databaserelationship.dbrelationonetomany.resources.entity.InternDetails;
import com.databaserelationship.dbrelationonetomany.resources.entity.Interns;
import com.databaserelationship.dbrelationonetomany.resources.request.InternDetailsRequest;
import com.databaserelationship.dbrelationonetomany.service.InternDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/interns/details")
public class InternDetailsController {

    @Autowired
    InternDetailsService internDetailsService;

    @PostMapping
    public Interns createInternDetails(@RequestBody InternDetailsRequest request) {
        return internDetailsService.createInternDetails(request);
    }
}
