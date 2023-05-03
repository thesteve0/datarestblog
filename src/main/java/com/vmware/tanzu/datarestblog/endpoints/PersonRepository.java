package com.vmware.tanzu.datarestblog.endpoints;

import com.vmware.tanzu.datarestblog.dataobjects.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    Person findById(Long id);

    @Query("SELECT p FROM Person p WHERE p.lastName = :lastName AND p.firstName = 'Steven'")
    List<Person> findAllStevesByLastName(@Param("lastName") String lastName);



}

