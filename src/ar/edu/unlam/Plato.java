package ar.edu.unlam;

import java.util.HashSet;

public class Plato {

	private String nombre;
	//private String ingredientes;
	
	HashSet<String> coleccionDeIngredientes;
	
	private TipoDeElaboracion tipoDeElaboracion;

	/*
	public Plato(String nombre, String ingredientes, TipoDeElaboracion tipoDeElaboracion) {
		this.nombre=nombre;
		this.ingredientes=ingredientes;
		this.tipoDeElaboracion=tipoDeElaboracion;	
	}
	*/
	public Plato(String nombre,  TipoDeElaboracion tipoDeElaboracion) {
		this.nombre=nombre;
		coleccionDeIngredientes= new HashSet<String>();
		this.tipoDeElaboracion=tipoDeElaboracion;	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void ingresarIngredienteALaColeccion(String nombreDelIngrediente) {
		coleccionDeIngredientes.add(nombreDelIngrediente);
	}
	
	public HashSet<String> conocerColeccionDeIngredientes() {
		return coleccionDeIngredientes;
	}

	/*
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}*/

	public TipoDeElaboracion getTipoDeElaboracion() {
		return tipoDeElaboracion;
	}

	public void setTipoDeElaboracion(TipoDeElaboracion tipoDeElaboracion) {
		this.tipoDeElaboracion = tipoDeElaboracion;
	}

	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", coleccionDeIngredientes=" + coleccionDeIngredientes
				+ ", tipoDeElaboracion=" + tipoDeElaboracion + "]";
	}


	
}
