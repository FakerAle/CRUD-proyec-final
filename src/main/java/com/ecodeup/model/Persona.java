package com.ecodeup.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 @Entity
 @Table(name="persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int perid;
	
	@Column
	private String pernombre;
	
	@Column
	private String perapellido;
	
	@Column
	private String pertelefonofijo;
	
	@Column
	private String perfechanacimiento;
	
	@Column
	private String percedula;
	
	
	
	public int getPerid() {
		return perid;
	}

	public void setPerid(int perid) {
		this.perid = perid;
	}

	public String getPernombre() {
		return pernombre;
	}

	public void setPernombre(String pernombre) {
		this.pernombre = pernombre;
	}

	public String getPerapellido() {
		return perapellido;
	}

	public void setPerapellido(String perapellido) {
		this.perapellido = perapellido;
	}

	public String getPertelefonofijo() {
		return pertelefonofijo;
	}

	public void setPertelefonofijo(String pertelefonofijo) {
		this.pertelefonofijo = pertelefonofijo;
	}

	public String getPerfechanacimiento() {
		return perfechanacimiento;
	}

	public void setPerfechanacimiento(String perfechanacimiento) {
		this.perfechanacimiento = perfechanacimiento;
	}

	public String getPercedula() {
		return percedula;
	}

	public void setPercedula(String percedula) {
		this.percedula = percedula;
	}

	

	
	
	


	
	
	
	
	
	
	
}
