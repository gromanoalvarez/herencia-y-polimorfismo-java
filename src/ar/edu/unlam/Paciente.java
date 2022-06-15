package ar.edu.unlam;

public abstract class Paciente {
	private String nombre;
	private Plato plato;

	public Paciente() {
	}
	
	public Paciente(String nombre, Plato platillo) {
		this.nombre=nombre;
		this.plato=platillo;
	}
	
	public abstract Boolean restriccionAlimentaria(Plato unPlato);
}
