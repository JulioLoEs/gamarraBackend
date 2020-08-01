package com.proyecto.integrador.store.demo.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_categoria")
public class Categoria {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcategoria;
	@Column
	private String nombrecategoria;
	@Column
	private String descripcioncate;
	@Column
	private String imagencate;
	
	

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNombrecategoria() {
		return nombrecategoria;
	}

	public void setNombrecategoria(String nombrecategoria) {
		this.nombrecategoria = nombrecategoria;
	}

	public String getDescripcioncate() {
		return descripcioncate;
	}

	public void setDescripcioncate(String descripcioncate) {
		this.descripcioncate = descripcioncate;
	}

	public String getImagencate() {
		return imagencate;
	}

	public void setImagencate(String imagencate) {
		this.imagencate = imagencate;
	}

 
 
 

}
