package com.databaserelationship.dbrelationonetomany.controller;

import com.databaserelationship.dbrelationonetomany.resources.entity.Interns;
import com.databaserelationship.dbrelationonetomany.resources.request.InternRequest;
import com.databaserelationship.dbrelationonetomany.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/interns")
public class InternController {

    @Autowired
    InternService internService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Interns createIntern(@RequestBody InternRequest request) {
        return internService.createIntern(request);
    }

    @PutMapping("/{id}")
    public Interns updateIntern(@RequestParam("id") Long id, @RequestBody InternRequest request) {
        return internService.updateIntern(id, request);
    }
}
