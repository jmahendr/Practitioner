package com.practitioner.browseparctitionerservice.repositories;

import com.practitioner.browseparctitionerservice.domain.Practitioner;
import org.springframework.data.repository.CrudRepository;

public interface PractitionerRepository extends CrudRepository<Practitioner, Long> {
}
