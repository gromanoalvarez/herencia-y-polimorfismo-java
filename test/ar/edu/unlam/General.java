package ar.edu.unlam;

public class General extends Paciente {
	public General() {

	}

	public General(String nombre, Plato unPlato) {
		super(nombre, unPlato);

	}

	@Override
	public Boolean restriccionAlimentaria(Plato unPlato) {
		return false;

	}

}
