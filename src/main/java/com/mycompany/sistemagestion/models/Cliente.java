/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestion.models;

/**
 *
 * @author kenneth
 */
public class Cliente {
    private String id;  

    
    private String nombre;

    private String apellido;
    private String email;
    private String telefono;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public void setApellido(String valor){
        apellido = valor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getNombreCompleto(){
        return "nombre completo: "+ nombre+" "+ apellido;
    }

    
    
}
