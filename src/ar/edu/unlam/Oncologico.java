package ar.edu.unlam;

public class Oncologico extends Paciente {


	public Oncologico() {

	}

	public Oncologico(String nombre, Plato unPlato) {
		super(nombre, unPlato);

	}
	@Override
	public Boolean restriccionAlimentaria(Plato platoAAnalizar) {
		return (platoAAnalizar.getTipoDeElaboracion()==TipoDeElaboracion.CRUDO); 

	}

}
