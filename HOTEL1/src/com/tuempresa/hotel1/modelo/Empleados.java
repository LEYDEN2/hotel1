package com.tuempresa.hotel1.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Empleados extends Identifiable{
	@Column(length = 64)
	@Required
	String nombres;
	
	@Column(length = 64)
	@Required
	String apellidos;
	
	 @Files @Required
	    @Column (length = 32)
	    String fotos; 
	 
	 @Required
	 @Embedded 
		Direccion direccion;
	 
	 @ManyToOne(  
				fetch=FetchType.LAZY,  
				optional=true)  
				@DescriptionsList
	    TareaEmpleados tareaempleado;
	 
	 
	 @ManyToOne(  
				fetch=FetchType.LAZY,  
				optional=true)  
	// @ReferenceView("Vuelos") 
				Registro registro;
	 
}
