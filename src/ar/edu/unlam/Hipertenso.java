package ar.edu.unlam;

public class Hipertenso extends Paciente {
	public Hipertenso() {

	}

	public Hipertenso(String nombre, Plato unPlato) {
		super(nombre, unPlato);

	}
	@Override
	public Boolean restriccionAlimentaria(Plato platoAAnalizar) {
		return (platoAAnalizar.conocerColeccionDeIngredientes().contains("sal")); 

	}

}
