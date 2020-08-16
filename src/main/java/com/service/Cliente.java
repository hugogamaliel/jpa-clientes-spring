package com.service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inv_clientes")
public class Cliente 
{
	
	private long id_cliente;	
	private String nombre;
	private String direccion;
	private String colonia;
	private String telefono;
	private String lugar;
	 
	public Cliente() 
	{
		
	}
	
	/*
	public Employee(String firstName, String lastName, String emailId) {
	         this.firstName = firstName;
	         this.lastName = lastName;
	         this.emailId = emailId;
	    }
	*/
	
	@Id
	@Column(name = "id_cliente", nullable = false)
	public long getIdCliente() {
        return id_cliente;
    }
	
    public void setIdCliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    @Column(name = "nombre", nullable = false)
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name = "direccion", nullable = false)
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Column(name = "colonia", nullable = false)
    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    
    @Column(name = "telefono", nullable = false)
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Column(name = "lugar", nullable = false)
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
	  
}
