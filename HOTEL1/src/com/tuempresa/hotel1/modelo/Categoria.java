package com.tuempresa.hotel1.modelo;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Categoria extends Identifiable
{
@Column
String descripcion;


}
