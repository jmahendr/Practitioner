package com.practitioner.browseparctitionerservice.controllers;

import com.practitioner.browseparctitionerservice.domain.Practitioner;
import com.practitioner.browseparctitionerservice.repositories.PractitionerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PractitionerController {

    @Autowired
    private PractitionerRepository practitionerRepository;

    @RequestMapping(value = "/practitioner", method = RequestMethod.GET)
    public List<Practitioner> listPractitioners(){
        return (List<Practitioner>) this.practitionerRepository.findAll();
    }

    @RequestMapping(value = "/practitioner", method = RequestMethod.POST)
    public Practitioner saveOrUpdatePractitioner(@RequestBody Practitioner p) {
        Practitioner saved = this.practitionerRepository.save(p);
        return saved;
    }
}
