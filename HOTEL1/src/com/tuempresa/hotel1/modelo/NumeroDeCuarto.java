package com.tuempresa.hotel1.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity @Getter@Setter

public class NumeroDeCuarto extends Identifiable{
@Column
String descripcion;


@ManyToOne(  
			fetch=FetchType.LAZY,  
			optional=true)  
			@DescriptionsList  
			Categoria categoria;

@Money
BigDecimal precio;

@ManyToOne(  
		fetch=FetchType.LAZY,  
		optional=true)  
// @ReferenceView("Vuelos") 
		Registro registro;

}
