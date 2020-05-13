package co.com.udea.entity;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;


@Entity
@Data

public class Customer implements Serializable{

		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
	    private String nombre;
	    private String apellido;
	    private String email;
	    private String direccion;
	    private String telefono;

	}
