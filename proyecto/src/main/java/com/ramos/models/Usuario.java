package com.ramos.models;

public class Usuario {
	private int id;
	private String nombres;
	private String apellidos;
	private String email;
	private String estado;
	private String tipo;
	private String telefono;
	private String imagen;
	private String created_at;
	private String updated_at;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public Usuario(int id, String nombres, String apellidos, String email, String estado, String tipo, String telefono,
			String imagen, String created_at, String updated_at) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
		this.estado = estado;
		this.tipo = tipo;
		this.telefono = telefono;
		this.imagen = imagen;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public Usuario() {
		super();
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email
				+ ", estado=" + estado + ", tipo=" + tipo + ", telefono=" + telefono + ", imagen=" + imagen
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
}
