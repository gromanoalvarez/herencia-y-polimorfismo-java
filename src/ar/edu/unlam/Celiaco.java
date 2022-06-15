package ar.edu.unlam;

public class Celiaco extends Paciente {
	
	public Celiaco() {

	}

	public Celiaco(String nombre, Plato unPlato) {
		super(nombre, unPlato);

	}

	@Override
	public Boolean restriccionAlimentaria(Plato platoAAnalizar) {
		return (platoAAnalizar.conocerColeccionDeIngredientes().contains("trigo")||platoAAnalizar.conocerColeccionDeIngredientes().contains("avena")||platoAAnalizar.conocerColeccionDeIngredientes().contains("cebada")||platoAAnalizar.conocerColeccionDeIngredientes().contains("centeno")); 

	}
}
