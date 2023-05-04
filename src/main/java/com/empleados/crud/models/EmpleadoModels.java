package com.empleados.crud.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "empleados")

public class EmpleadoModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long Id;

    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String numeroDocumento;
    private Date fechaNacimiento;
    private Date fechaVinculacion;
    private String cargo;
    private Double salario;
    /*
     * public EmpleadoModels() {
     * }
     * 
     * public EmpleadoModels(String nombres, String apellidos, String tipoDocumento,
     * String numeroDocumento, Date fechaNacimiento, Date fechaVinculacion,
     * String cargo, Double salario) {
     * this.nombres = nombres;
     * this.apellidos = apellidos;
     * this.tipoDocumento = tipoDocumento;
     * this.numeroDocumento = numeroDocumento;
     * this.fechaNacimiento = fechaNacimiento;
     * this.fechaVinculacion = fechaVinculacion;
     * this.cargo = cargo;
     * this.salario = salario;
     * }
     * 
     * public String getNombres() {
     * return nombres;
     * }
     * 
     * public void setNombres(String nombres) {
     * this.nombres = nombres;
     * }
     * 
     * public String getApellidos() {
     * return apellidos;
     * }
     * 
     * public void setApellidos(String apellidos) {
     * this.apellidos = apellidos;
     * }
     * 
     * public String getTipoDocumento() {
     * return tipoDocumento;
     * }
     * 
     * public void setTipoDocumento(String tipoDocumento) {
     * this.tipoDocumento = tipoDocumento;
     * }
     * 
     * public String getNumeroDocumento() {
     * return numeroDocumento;
     * }
     * 
     * public void setNumeroDocumento(String numeroDocumento) {
     * this.numeroDocumento = numeroDocumento;
     * }
     * 
     * public Date getFechaNacimiento() {
     * return fechaNacimiento;
     * }
     * 
     * public void setFechaNacimiento(Date fechaNacimiento) {
     * this.fechaNacimiento = fechaNacimiento;
     * }
     * 
     * public Date getFechaVinculacion() {
     * return fechaVinculacion;
     * }
     * 
     * public void setFechaVinculacion(Date fechaVinculacion) {
     * this.fechaVinculacion = fechaVinculacion;
     * }
     * 
     * public String getCargo() {
     * return cargo;
     * }
     * 
     * public void setCargo(String cargo) {
     * this.cargo = cargo;
     * }
     * 
     * public Double getSalario() {
     * return salario;
     * }
     * 
     * public void setSalario(Double salario) {
     * this.salario = salario;
     * }
     */
}
