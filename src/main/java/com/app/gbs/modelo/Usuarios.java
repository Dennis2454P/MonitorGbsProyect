package com.app.gbs.modelo;

import jakarta.persistence.*;


/*tabla de usuarios a registrar */
@Entity
@Table(name = "users")
public class Usuarios {
	/*llave primaria autoicremntal*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nombre;
    private String email;
    private String Apellido_paterno;
    private String Apellido_materno;
    private String Usuario;
    private int DNI;
    private int telefono;
    private String correo;
    private String contraseña;
    

    
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
	public Usuarios(Long id, String nombre, String email, String apellido_paterno, String apellido_materno,
			String usuario, int dNI, int telefono, String correo, String contraseña) {
		
		this.id = id;
		this.Nombre = nombre;
		this.email = email;
		this.Apellido_paterno = apellido_paterno;
		this.Apellido_materno = apellido_materno;
		this.Usuario = usuario;
		this.DNI = dNI;
		this.telefono = telefono;
		this.correo = correo;
		this.contraseña = contraseña;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getEmail() {
		return email;
	}
	public String getApellido_paterno() {
		return Apellido_paterno;
	}
	public String getApellido_materno() {
		return Apellido_materno;
	}
	public String getUsuario() {
		return Usuario;
	}
	public int getDNI() {
		return DNI;
	}
	public int getTelefono() {
		return telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public String getContraseña() {
		return contraseña;
	}
    
    
    


	

}

