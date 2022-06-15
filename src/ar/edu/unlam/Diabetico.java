package ar.edu.unlam;

public class Diabetico extends Paciente {
	protected Boolean EsInsulinoDependiente;
	
	public Diabetico() {
		this.EsInsulinoDependiente=false;
	}

	public Diabetico(String nombre, Plato unPlato) {
		super(nombre, unPlato);
		this.EsInsulinoDependiente=false;
	}

	@Override
	public Boolean restriccionAlimentaria(Plato platoAAnalizar) {
		return(platoAAnalizar.conocerColeccionDeIngredientes().contains("azucar"));
	}

	
	public Boolean SaberSiRequiereInsulina() {
		return (this.EsInsulinoDependiente);
	}

}
