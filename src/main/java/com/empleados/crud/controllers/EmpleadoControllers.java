package com.empleados.crud.controllers;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.empleados.crud.models.EmpleadoModels;
import com.empleados.crud.services.EmpleadoServices;

@RestController
@RequestMapping("/empleados")

public class EmpleadoControllers {
    @Autowired
    EmpleadoServices empleadoServices;

    @PostMapping("/empleados")
    public void crearEmpeladoModels(@RequesBody EmpleadoModels empleado) {
        empleadoServices.crearEmpleados(empleado);
    }

    @GetMapping()
    public ArrayList<EmpleadoModels> obtenerEmpleados() {
        return empleadoServices.obtenerEmpleados();

    }

    @PostMapping()
    public EmpleadoModels guaradrEmpleado(@RequestBody EmpleadoModels empleado) {
        return this.empleadoServices.guardarEmpleado(empleado);

    }

    @GetMapping(path = "/{id}")
    public Optional<EmpleadoModels> obtenerEmpleadosPorId(@PathVariable("id") Long id) {
        return this.empleadoServices.obtenerPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.empleadoServices.eliminarEmpleados(id);
        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No pudo eliminar el usuario con id" + id;
        }
    }

}
