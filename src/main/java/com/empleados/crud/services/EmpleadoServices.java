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

    public void crearEmpeladoModels(EmpleadoModels empleados) {
        EmpleadoRepository.save(empleados);

    }

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

    // método para validar formatos de fecha
    public boolean validarFormatoFechas() {
        String formatoFecha = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(formatoFecha);
        sdf.setLenient(false);
        try {
            // validar la fecha de nacimiento
            Date fechaNacimiento = sdf.parse(sdf.format(this.fechaNacimiento));
            if (!fechaNacimiento.equals(this.fechaNacimiento)) {
                return false;
            }

            // validar la fecha de vinculación
            Date fechaVinculacion = sdf.parse(sdf.format(this.fechaVinculacion));
            if (!fechaVinculacion.equals(this.fechaVinculacion)) {
                return false;
            }
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    // método para validar que los campos no estén vacíos
    public boolean validarCampos() {
        if (this.nombres.isEmpty() || this.apellidos.isEmpty() || this.tipoDocumento.isEmpty() ||
                this.numeroDocumento.isEmpty() || this.fechaNacimiento == null ||
                this.fechaVinculacion == null || this.cargo.isEmpty() || this.salario == null) {
            return false;
        }
        return true;
    }

    // método para validar que el empleado sea mayor de edad
    public boolean validarEdad() {
        LocalDate fechaNacimiento = this.fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, ahora);
        int edad = periodo.getYears();
        return edad >= 18;
    }

}
