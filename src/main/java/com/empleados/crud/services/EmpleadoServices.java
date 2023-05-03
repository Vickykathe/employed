package com.empleados.crud.services;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleados.crud.models.EmpleadoModels;
import com.empleados.crud.repositories.EmpleadoRepository;

@Service
public class EmpleadoServices {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public ArrayList<EmpleadoModels> obtenerEmpleados() {
        return (ArrayList<EmpleadoModels>) empleadoRepository.findAll();
    }

    public EmpleadoModels guardarEmpleado(EmpleadoModels empleados) {
        return empleadoRepository.save(empleados);

    }

    public Optional<EmpleadoModels> obtenerPorId(Long id) {
        return empleadoRepository.findById(id);
    }

    public boolean eliminarEmpleados(Long id) {
        try {
            empleadoRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
