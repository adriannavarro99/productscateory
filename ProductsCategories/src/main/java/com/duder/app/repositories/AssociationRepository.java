package com.duder.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.duder.app.models.*;



@Repository
public interface AssociationRepository extends CrudRepository<Association,Long>{

}