package com.tuempresa.hotel1.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Embeddable @Getter @Setter
public class Direccion {
	@Required
	@Column(length = 30)
	String viaPublica;
	@Required
	@Column (length = 5)
	int CodigoPostal;
	   
	@Required
	@Column(length = 30)
	String provincia;
	
}
