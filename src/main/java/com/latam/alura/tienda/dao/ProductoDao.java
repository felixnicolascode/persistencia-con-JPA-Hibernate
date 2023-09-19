package com.latam.alura.tienda.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.modelo.Producto;

public class ProductoDao {
	
	private EntityManager em;
	
	public ProductoDao (EntityManager em) {
		this.em = em;
	}
	
	public void guardar(Producto producto) {
		this.em.persist(producto);
	}
	
	public Producto consultarPorId(Long Id) {
		return em.find(Producto.class, Id);
		
	}
	
	public List<Producto> consultarTodos(){
		String jqpl = "SELECT P FROM Producto AS P";
		return em.createQuery(jqpl, Producto.class).getResultList();
	}

}
