package com.databaserelationship.dbrelationonetomany.service;

import com.databaserelationship.dbrelationonetomany.repository.InternRepository;
import com.databaserelationship.dbrelationonetomany.resources.entity.InternDetails;
import com.databaserelationship.dbrelationonetomany.resources.entity.Interns;
import com.databaserelationship.dbrelationonetomany.resources.request.InternDetailsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InternDetailsService {

    @Autowired
    InternRepository repository;

    public Interns createInternDetails(InternDetailsRequest request) {

        InternDetails details = new InternDetails(
                request.getAddress(),
                request.getZipCode()
        );
        Optional<Interns> optionalIntern = repository.findById(request.getId());

        Interns intern = null;
        if (optionalIntern.isPresent()) {
            intern = optionalIntern.get();
        }
        intern.setInternDetails(details);
        return repository.save(intern);
    }
}
