package com.tuempresa.hotel1.modelo;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;
import org.openxava.model.*;

import com.tuempresa.hotel1.modelo.calculadores.*;

import lombok.*;

@Entity @Getter @Setter

public class Registro extends Identifiable{
	@Column(length=4)
	 @DefaultValueCalculator(CurrentYearCalculator.class) 
	 int anyo;
	
	@ReadOnly 
	@DefaultValueCalculator(value = CalculadorSiguienteNumeroParaAnyo.class, properties = @PropertyValue(name = "anyo") )
	@Column (length = 6)
	int numero;
	
	@DefaultValueCalculator(CurrentLocalDateCalculator.class) 
	LocalDate fecha;
	
	@OneToMany  	
	Collection<NumeroDeCuarto>NDeCuarto;
	 
	
	
	
@OneToMany  	
	Collection<Cliente>clientes;

@OneToMany  	
Collection<Empleados>empleado;


}
