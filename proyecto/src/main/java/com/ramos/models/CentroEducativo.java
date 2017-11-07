package com.ramos.models;

public class CentroEducativo {
	private int id;
	private String tipo;
	private String nombre;
	private String direccion;
	private String logo;
	private String imagen;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public CentroEducativo(int id, String tipo, String nombre, String direccion, String logo, String imagen) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.logo = logo;
		this.imagen = imagen;
	}
	public CentroEducativo() {
		super();
	}
	@Override
	public String toString() {
		return "CentrosEducativo [id=" + id + ", tipo=" + tipo + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", logo=" + logo + ", imagen=" + imagen + "]";
	}
	
	
}
