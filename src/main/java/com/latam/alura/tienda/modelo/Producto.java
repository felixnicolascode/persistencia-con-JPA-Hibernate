package com.latam.alura.tienda.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	
	// entidades son representadas por clases
	
	private Long id;
	private String nombre;
	private String descripcion;
	private BigDecimal precio;

}
