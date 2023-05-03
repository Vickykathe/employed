package com.empleados.crud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empleados.crud.models.EmpleadoModels;

@Repository

public interface EmpleadoRepository extends CrudRepository<EmpleadoModels, Long> {

}