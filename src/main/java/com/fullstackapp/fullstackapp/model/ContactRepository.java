package com.fullstackapp.fullstackapp.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryResource
public interface ContactRepository extends CrudRepository<Contact , Long> {

}
